package lab3;

import java.io.IOException;

/**
 *
 * @author Kyle
 */
public class Lab3 {

    public static void main(String[] args) {
        int recordNum = 5;
        
        DisplayStrategy output = new DisplayGUI();

        try {
            FileChecker fileChecker = new FileChecker();
            LocateRecord locate = new LocateRecord(fileChecker);
            output.display(locate.getRecord(recordNum));
            output.display(locate.getRecordCity(recordNum));
        } catch (IOException ex) {
            output.display(ex.getMessage());
        } catch (IllegalArgumentException iae){
            output.display(iae.getLocalizedMessage());
        }

    }
}
