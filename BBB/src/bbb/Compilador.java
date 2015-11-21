package bbb;

import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import Entrega1.GramBBBLexer;
import Entrega1.GramBBBParser;
import Entrega1.GramBBBParser.InitContext;
import java.io.InputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Compilador {

    public static void main(String[] args) throws IOException {
        
        InputStream is = new FileInputStream("C:\\Users\\JesusDavid\\Desktop\\COMPILATORS\\input.txt");
        
        //We load our lexer
        GramBBBLexer lexer = new GramBBBLexer(new ANTLRInputStream(is));
        
        //We get the matchet tokens from input
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        //Parse tokens
        GramBBBParser parser = new GramBBBParser(tokens);
        
        //Specify initial gramatical function
        InitContext sentenceContext = parser.init();
        
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(null, sentenceContext);
        int x = 1;
        return;
    }
    
}
