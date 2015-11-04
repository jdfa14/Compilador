package bbb;

import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import Entrega1.*;

public class Compilador {

    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[1]));
        GramaticaLexer lexer = new GramaticaLexer(input);
    }
    
}
