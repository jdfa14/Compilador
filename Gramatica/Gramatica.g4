grammar Gramatica;

WS: [ \n\t\r]+ -> skip;

AP: '(';
CP: ')';
AL: '{';
CL: '}';
AC: '[';
CC: ']';
COM: ',';

INT: 'ent';
FLT: 'dec';
BOL: 'bool';
CHA: 'cad';
STR: 'car';
VOID: 'nada';

PRNT: 'imprime';
COL: 'color';
MOV: 'mover';
INCL: 'incluir';
MAIN: 'main';

LWHILE: 'mientras';
LDO: 'hacer';
LFOR: 'para';
IF: 'si';

BRK: 'romper';
RTRN: 'regresar';

PINU: 'pintar';
PIND: 'flotar';

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

includes:
	| HT INCL CTES DEL includes
	| HT INCL MEN CTES MAY DEL includes
	;

params:
	| params2
	;

params2:
	exp
	;

params3:
	| COM params2
	;

functioncall:
	ID AP params CP DEL
	;

functiondecl:
	type ID AP params CP AL estatutos CL
	;

main:
	INT MAIN AP params CP AL estatutos CL
	;

asignations:
	| asignation asignations
	;

asignation:
	ID IGU exp DEL
	;

declaration:
	type declaration2;

declaration2:
	ID declaration3
	| AC CC declaration4 ID declaration5

declaration3:
	| IGU exp DEL
	;

declaration4:
	| AC CC declaration4
	;

declaration5:
	| IGU type declaration6
	;

declaration6:
	| AC exp CC declaration6
	;

print:
	PRNT exp DEL
	;

condition:
	IF AP exp CP AL estatutos CL DEL
	;

loops:
	whle
	| fr
	| dowhle
	;

whle:
	LWHILE AP exp CP AL estatutos CL
	;

dowhle:
	LDO AL estatutos CL LWHILE AP exp CP
	;

fr:
	LFOR AP asignations DEL exp DEL estatutos CP AL estatutos CL
	;

instructions:
	PINU DEL
	| PIND DEL
	| COL AP exp COM exp COM exp CP DEL
	| MOV AP exp COM exp CP DEL
	;

estatutos:
	| estatuto estatutos;

estatuto:
	functioncall
	| functiondecl
	| asignation
	| print
	| instructions
	| loops
	| condition
	| BRK
	| RTRN
	;

opc:
	MAY
	| MEN
	| MAI
	| MEI
	| OIG
	| DIF
	;

exp:
	ex exp2
	;

exp2:
	| opc ex
	;

ex:
	termino ex2
	;

ex2:
	| PLS ex
	| SUB ex
	;

termino:
	factor termino2
	;

termino2:
	| MLT termino
	| DIV termino
	;

factor:
	AP exp CP
	| val
	| PLS val
	| SUB val
	;

val:
	ID
	| CTES
	| CTEC
	| CTEI
	| CTEF
	;

type:
	INT
	| FLT
	| BOL
	| CHA
	| STR
	| VOID
	;