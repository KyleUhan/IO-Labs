package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyle
 */
public class FileChecker {

    private final static int RECORD_SIZE = 6;
    private List<String> fileContent;

    private File file = new File(File.separatorChar + "Users" + File.separatorChar
            + "Kyle" + File.separatorChar + "Desktop" + File.separatorChar
            + "Java" + File.separatorChar + "lab1.txt");

    public FileChecker() throws IOException {
        setFileContent(new ArrayList<String>());
        transferFileContents();
    }

    //Transfers data from file to array list
    private void transferFileContents() throws IOException {
        BufferedReader input = null;
        input = new BufferedReader(new FileReader(getFile()));
        String line = input.readLine();
        while (line != null) {
            getFileContent().add(line);
            line = input.readLine();
        }
        input.close();
    }

    public final int fileSize() {
        return getFileContent().size() / RECORD_SIZE;
    }

    public final File getFile() {
        return file;
    }

    //Possible dynamic file setter...not crazy about it since the entire
    //path is needed..will work on it
    //Also debating about validation needs - My first thought is that the String
    //argument doesn't need any specific validation as the FileNotFoundException
    //should cover just about everything...the file either exists or it doesn't.
    public final void setFile(String filePath) throws FileNotFoundException{
        this.file = new File(filePath);
    }
    
    

    public final List<String> getFileContent() {
        return fileContent;
    }

    public final void setFileContent(final List<String> fileContent) {
        this.fileContent = fileContent;
    }

    public static void main(String[] args) throws IOException {
        FileChecker fc = new FileChecker();
        for (String s : fc.getFileContent()) {
            System.out.println(s);
        }
        System.out.println("Records in file: " + fc.fileSize());

    }

}
