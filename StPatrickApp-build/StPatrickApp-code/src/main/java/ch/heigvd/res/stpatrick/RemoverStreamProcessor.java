/*
 * Labo : Challenge de la St-Patrick
 * Auteur : Nathalie Mégevand
 * Date : 20 mars 2017
 * Fichier : RemoverStreamProcessor.java
 * 
 * 
 */

package ch.heigvd.res.stpatrick;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


public class RemoverStreamProcessor implements IStreamProcessor {
    
    private char toRemove;
    
    public RemoverStreamProcessor(char toRemove) {
        this.toRemove = toRemove;
    }

    @Override
    public void process(Reader in, Writer out) throws IOException {
        int current;
        while((current = in.read() ) != -1) {
            if((char)current != Character.toLowerCase(toRemove) && 
               (char)current != Character.toUpperCase(toRemove) )
            {
                out.write(current);
            }
        }
        
        
    }

}
