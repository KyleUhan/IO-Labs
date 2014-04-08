/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

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
    

    public FileService(final InputStrategy input, final DisplayStrategy output, final FileStrategy file) {
        setInput(input);
        setOutput(output);
        setFile(file);
    }

    
    
    public final InputStrategy getInput() {
        return input;
    }

    public final void setInput(final InputStrategy input) throws NullPointerException{
        if(input == null){
            throw new NullPointerException();
        }
        this.input = input;
    }

    public final DisplayStrategy getOutput() {
        return output;
    }

    public final void setOutput(final DisplayStrategy output) throws NullPointerException{
        if(output == null){
            throw new NullPointerException();
        }
        this.output = output;
    }

    public final FileStrategy getFile() {
        return file;
    }

    //Check for Null
    //Check for not exists (this may cover null)
    public final void setFile(final FileStrategy file) {
        this.file = file;
    }

}
