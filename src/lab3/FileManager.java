package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kyle
 */
public class FileManager {

    private final static int RECORD_SIZE = 6;
    private List<String> fileContent;

    private File file = new File(File.separatorChar + "Users" + File.separatorChar
            + "Kyle" + File.separatorChar + "Desktop" + File.separatorChar
            + "Java" + File.separatorChar + "lab1.txt");

    public FileManager() throws IOException {
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

    public final void setFile(final String filePath) throws FileNotFoundException {
        File tempFile = new File(filePath);
        if (!tempFile.exists()) {
            throw new FileNotFoundException("Unable to locate file");
        }
        this.file = tempFile;
    }

    public final List<String> getFileContent() {
        return fileContent;
    }

    public final void setFileContent(final List<String> fileContent) throws NullPointerException {
        if (fileContent == null) {
            throw new NullPointerException("Must not be Null");
        }
        this.fileContent = fileContent;
    }

    public static int getRECORD_SIZE() {
        return RECORD_SIZE;
    }

}
