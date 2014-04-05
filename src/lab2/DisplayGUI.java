/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author Kyle
 */
public class DisplayGUI implements DisplayStrategy {

    private int recordNum;

    public DisplayGUI() {
        setRecordNum(Integer.parseInt(JOptionPane.showInputDialog("Enter the record Number:")));
    }

    public final int getRecordNum() {
        return recordNum;
    }

    public final void setRecordNum(final int recordNum) throws IllegalArgumentException {
        this.recordNum = recordNum;
    }

    @Override
    public void display(String record) throws IllegalArgumentException{
        if(record.isEmpty()){
            throw new IllegalArgumentException();
        }
         JOptionPane.showMessageDialog(null, record, "Record", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public int getRecordNumber() {
        return getRecordNum();
    } 

}
