package bbb;

import API.CompiAPI;
import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import Entrega1.GramBBBLexer;
import Entrega1.GramBBBParser;
import Entrega1.GramBBBParser.InitContext;
import Entrega4.Cuadruplo;
import java.io.InputStream;
import java.util.LinkedList;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Compilador {

    public static void main(String[] args) throws IOException {
        try{
            InputStream is = new FileInputStream("C:\\Users\\JesusDavid\\Desktop\\COMPILATORS\\input.txt");
            //We load our lexer
            GramBBBLexer lexer = new GramBBBLexer(new ANTLRInputStream(is));

            //We get the matchet tokens from input
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            //Parse tokens
            GramBBBParser parser = new GramBBBParser(tokens);

            //Specify initial gramatical function
            InitContext sentenceContext = parser.init();
            LinkedList<Cuadruplo> cuads = CompiAPI.getCuadruplos();
            cuads.stream().forEach((cuad) -> {
                System.out.println(cuad.getOperador() + " " + cuad.getLongOperando1() + " " + cuad.getLongOperando2() + " " + cuad.getResultado());
            });
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
