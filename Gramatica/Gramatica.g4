grammar Gramatica;

WS: [ \n\t\r]+ -> skip;

OP: '(';
CP: ')';
OK: '{';
CK: '}';
OB: '[';
CB: ']';
COM: ',';

INT: 'ent';
FLT: 'dec';
BOL: 'bool';
CHA: 'cad';
STR: 'car';
VOID: 'nada';

INCL: 'incluir';
MAIN: 'main';

LWHILE: 'mientras';
LDO: 'hacer';
LFOR: 'para';
CIF: 'si';
CELSE: 'sino';

BRK: 'romper';
RTRN: 'regresar';

PINU: 'pintar';
PIND: 'flotar';
COL: 'color';
PRNT: 'imprime';
MOV: 'mover';

OAND: '&&';
OOR: '||';
ONOT: '!';

HT: '#';

IGU: '=';
DEL: ';';

MLT: '*';
DIV: '/';
MOD: '%';
PLS: '+';
SUB: '-';

MAI: '>=';
MEI: '<=';
OIG: '==';
DIF: '!=';
MAY: '>';
MEN: '<';

CTEC: '"'[a-zA-Z0-9]'"';
CTES: '"'[a-zA-Z0-9]*'"';
CTEF: [0-9]*'.'[0-9]+;
CTEI: [0-9]+;

ID: [a-zA-Z0-9]+;

init:
	includes functions maindecl
	;

includes:
	| include includes
	;

include:
	HT INCL include2
	;

include2:
	CTES
	| MEN CTES MAY
	;

functions:
	| functiondecl functions
	;

functiondecl:
	type ID OP params CP OK estatutos CK
	;

maindecl:
	INT MAIN OP CP OK estatutos CK
	;

type:
	INT
	| FLT
	| BOL
	| STR
	| VOID
	;

params:
	| params2
	;

params2:
	declaration params3
	;

params3:
	| COM params2
	;

declaration:
	type declaration2
	;

declaration2:
	singledim
	| multidim
	;

singledim:
	ID DEL
	;

multidim:
	OB dimd CB ID DEL
	;

dimd:
	exp dimd2
	;

dimd2:
	| COM dimd
	;

asignations:
	asignation asignations2
	;

asignations2:
	| asignation
	;

asignation:
	ID asignation2
	;

asignation2:
	IGU exp
	| OB dima CB IGU exp
	;

dima:
	exp dima2
	;

dima2:
	| COM dima
	;

estatutos:
	| estatuto estatutos
	;

estatuto:
	BRK
	| RTRN
	| functioncall
	| asignation
	| declaration
	| print
	| instructions
	| loops
	| conditional
	;

loops:
	llwhile
	| lldowhile
	| llfor
	;

llwhile:
	LWHILE OP exp CP OK estatutos CK
	;

llfor:
	LFOR OP asignation DEL exp DEL asignations CP OK estatutos CK
	;

lldowhile:
	LDO OK estatutos CK LWHILE OP exp CP
	;

functioncall:
	ID OP params CP DEL
	;

conditional:
	CIF OP exp CP OK estatutos CK conditional2
	;

conditional2:
	| CELSE OK estatutos CK
	;

print:
	PRNT exp DEL
	;

instructions:
	PINU DEL
	| PIND DEL
	| COL OP CTEI COM CTEI COM CTEI CP
	| MOV OP CTEI COM CTEI CP
	;

exp:
	exo exp2
	;

exp2:
	| OAND exp
	;

exo:
	exn exo2
	;

exo2:
	| OOR exo
	;

exn:
	exi exn2
	;

exn2:
	| ONOT exn
	;

exi:
	exm exp2
	;

exi2:
	MAI exm
	| MEI exm
	| OIG exm
	| DIF exm
	| MAY exm
	| MEN exm
	;

exm:
	ex exm2
	;

exm2:
	| MOD exm
	;

ex:
	termino ex2
	;

ex2:
	| PLS ex
	| SUB ex
	;

termino:
	factor  termino2
	;

termino2:
	| MLT termino
	| DIV termino
	;

factor:
	OP exp CP
	| PLS var
	| SUB var
	| var
	;

var:
	ID
	| cte
	;

cte:
	CTEF
	| CTEI
	| CTES
	;