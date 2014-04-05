
package lab2;

/**
 *
 * @author Kyle
 */
public class lab2 {
    
    public static void main(String[] args) {
        //The GUI display handles both input and output for now
        //Also, the input is hard coded into the GUI constructor - that will
        //also change.
        
        DisplayStrategy GUI = new DisplayGUI();
        FileChecker fc = new FileChecker();
        
        try {
            LocateRecord lr = new LocateRecord(GUI.getRecordNumber(), fc);
            GUI.display(lr.getRecordContent());
        } catch (IndexOutOfBoundsException o) {
            GUI.display(o.getLocalizedMessage());
        } catch (NullPointerException n) {
            GUI.display(n.getMessage());
        } catch (IllegalArgumentException iae){
            GUI.display(iae.getMessage());
        }
        
    }
}
