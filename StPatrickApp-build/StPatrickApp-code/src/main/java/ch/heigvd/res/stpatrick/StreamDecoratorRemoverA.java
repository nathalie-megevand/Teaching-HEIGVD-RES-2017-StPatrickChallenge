/*
 * Labo : Challenge St-Patrick
 * Auteur : Nathalie Mégevand
 * Date : 20 mars 2017
 * Fichier : StreamDecoratorRemoverA.java
 * 
 *  
 */

package ch.heigvd.res.stpatrick;

import java.io.Reader;
import java.io.Writer;


public class StreamDecoratorRemoverA implements IStreamDecoratorController {

    @Override
    public Reader decorateReader(Reader inputReader) {
        return inputReader;
    }
    @Override
    public Writer decorateWriter(Writer outputWriter) {
        Writer decoratedWriter = null;
        try{
            decoratedWriter = new RemoverWriter(outputWriter, 'a'); 
        } catch (Exception e) {
            e.getMessage();
        }
        return decoratedWriter;
    }

}
