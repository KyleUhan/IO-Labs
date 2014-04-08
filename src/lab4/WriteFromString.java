/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Kyle
 */
public class WriteFromString implements WriterStrategy {
    public static final boolean append = true;

    private File file;

    private WriteFromString(File file) throws FileNotFoundException, NullPointerException {
        setFile(file);
    }

    @Override
    public final void writeToFile(String lineToWrite) throws IOException{
//        lineToWrite = lineToWrite.trim();
//        if(lineToWrite.contains(" ")){
//            
//        }
       // BufferedReader br = br = new BufferedReader(new FileReader(getFile()));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(getFile(), append)));
        pw.println(lineToWrite);
    }

    @Override
    public final void writeToFile(final List<String> arrayToWrite) throws IOException{

    }

    public final File getFile() {
        return file;
    }

    public final void setFile(final File file) throws FileNotFoundException {
        if (file == null) {
            throw new FileNotFoundException();
        }
        this.file = file;
    }

}
