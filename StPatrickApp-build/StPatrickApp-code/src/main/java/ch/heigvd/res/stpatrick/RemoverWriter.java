/*
 * Labo :
 * Auteur : Nathalie Mégevand
 * Date : 20 mars 2017
 * Fichier : RemoverWriter.java
 * 
 * Cette classe décor un writer
 */

package ch.heigvd.res.stpatrick;

import java.io.File;
import static java.io.FileDescriptor.out;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class RemoverWriter extends FileWriter {

    private char toRemove;
    public RemoverWriter(Write out, char toRemove) throws IOException {
        super(out);
        this.toRemove = toRemove; 
    }

    public void write(String str, int off, int len) throws IOException {
        
        if (len > 0) {
            str = str.substring(off, off + len - 1);
        }
        for (int i = 0; i < str.length(); i++) {
            write(str.charAt(i));
        }
                
    }
    
    public void write(int c) throws IOException {
     
        if((char)c != Character.toLowerCase(toRemove) && 
               (char)c != Character.toUpperCase(toRemove) )
            {
                out.write(c);
            }   
    }
}
