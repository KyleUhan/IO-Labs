package lab3;

import java.io.IOException;
import java.text.ParseException;

/**
 *
 * @author Kyle
 */
public class Lab3_StartUp {

    public static void main(String[] args) {
        //This represents service class

        DisplayStrategy output = new DisplayGUI();
        InputStrategy input = new InputGUI();

        int recordNum;
        try {
            recordNum = input.inputInt("Enter the Record Number: ", "RECORD SEARCH");
            FileManager fileChecker = new FileManager();
            LocateRecord locate = new LocateRecord(fileChecker);
            output.display(locate.getRecord(recordNum), "Record");
            output.display(locate.getRecordCity(recordNum), "Record City");
        } catch (IOException ex) {
            output.display(ex.getMessage());
        } catch (IllegalArgumentException iae) {
            output.display(iae.getLocalizedMessage());
        } catch (ParseException pe) {
            output.display(pe.getMessage());
        }

    }
}
