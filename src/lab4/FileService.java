/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.io.FileNotFoundException;

/**
 *
 * @author Kyle
 */
public class FileService {

    private InputStrategy input;
    private DisplayStrategy output;
    private FileStrategy file;
    private WriterStrategy writer;
    private ReaderStrategy reader;

    public FileService(final InputStrategy input, final DisplayStrategy output, final FileStrategy file) throws NullPointerException, FileNotFoundException {
        setInput(input);
        setOutput(output);
        setFile(file);
    }

    public void writeToFile(){
        
    }
    
    
    
    public final InputStrategy getInput() {
        return input;
    }

    public final void setInput(final InputStrategy input) throws NullPointerException {
        if (input == null) {
            throw new NullPointerException();
        }
        this.input = input;
    }

    public final DisplayStrategy getOutput() {
        return output;
    }

    public final void setOutput(final DisplayStrategy output) throws NullPointerException {
        if (output == null) {
            throw new NullPointerException();
        }
        this.output = output;
    }

    public final FileStrategy getFile() {
        return file;
    }

    public final void setFile(final FileStrategy file) throws FileNotFoundException {
        this.file = file;
    }

    public final WriterStrategy getWriter() {
        return writer;
    }

    public final void setWriter(final WriterStrategy writer) throws NullPointerException{
        if(writer == null){
            throw new NullPointerException();
        }
        this.writer = writer;
    }

    public final ReaderStrategy getReader() {
        return reader;
    }

    public final void setReader(final ReaderStrategy reader) throws NullPointerException{
        if(reader == null){
            throw new NullPointerException();
        }
        this.reader = reader;
    }
    
    

}
