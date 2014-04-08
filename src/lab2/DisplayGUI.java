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
        try {
            setRecordNum(Integer.parseInt(JOptionPane.showInputDialog("Enter the record Number:")));
        } catch (NumberFormatException nfe) {
            display("Must be a number. " + nfe.getMessage());
        }
    }

    public final int getRecordNum() {
        return recordNum;
    }

    public final void setRecordNum(final int recordNum) {
        this.recordNum = recordNum;
    }

    @Override
    public final void display(final String record) throws IllegalArgumentException {
        if (record.isEmpty()) {
            throw new IllegalArgumentException("Must not be 0");
        }
        JOptionPane.showMessageDialog(null, record, null, JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public final void display(final String record, final String header) {
        JOptionPane.showMessageDialog(null, record, header, JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public int getRecordNumber() {
        return getRecordNum();
    }

}
