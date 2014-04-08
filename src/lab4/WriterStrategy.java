/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Kyle
 */
public interface WriterStrategy {
    
    public abstract void writeToFile(String lineToWrite) throws IOException;
    
    public abstract void writeToFile(List<String> arrayToWrite) throws IOException;
    
}
