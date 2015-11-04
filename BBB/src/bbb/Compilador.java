package bbb;

import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;

public class Compilador {

    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[1]));
    }
    
}
