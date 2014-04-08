/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kyle
 */
public class InputGUI implements InputStrategy {

    @Override
    public final int inputInt() throws ParseException {
        int enteredInt = (Integer.parseInt(JOptionPane.showInputDialog("Enter a Number:")));
        return enteredInt;
    }

    @Override
    public final int inputInt(final String message) throws ParseException {
        int enteredInt = (Integer.parseInt(JOptionPane.showInputDialog(null, message, null, JOptionPane.PLAIN_MESSAGE)));
        return enteredInt;
    }
    
    @Override
    public final int inputInt(final String message, final String header) throws ParseException {
        int enteredInt = (Integer.parseInt(JOptionPane.showInputDialog(null, message, header, JOptionPane.PLAIN_MESSAGE)));
        return enteredInt;
    }

    @Override
    public final double inputDouble() throws ParseException {
        Double enteredDbl = (Double.parseDouble(JOptionPane.showInputDialog("Enter a decmial number:")));
        return enteredDbl;
    }

    @Override
    public final double inputDouble(final String message) throws ParseException {
        Double enteredDbl = (Double.parseDouble(JOptionPane.showInputDialog(null, message, null, JOptionPane.PLAIN_MESSAGE)));
        return enteredDbl;
    }
    
    @Override
    public final double inputDouble(final String message, final String header) throws ParseException {
        Double enteredDbl = (Double.parseDouble(JOptionPane.showInputDialog(null, message, header, JOptionPane.PLAIN_MESSAGE)));
        return enteredDbl;
    }

    @Override
    public final char inputChar() {
        char enteredChar = JOptionPane.showInputDialog("Enter a single character:").charAt(0);
        return enteredChar;
    }

    @Override
    public final char inputChar(final String message) {
        char enteredChar = JOptionPane.showInputDialog(null, message, null, JOptionPane.PLAIN_MESSAGE).charAt(0);
        return enteredChar;
    }
    
    @Override
    public final char inputChar(final String message, final String header) {
        char enteredChar = JOptionPane.showInputDialog(null, message, header, JOptionPane.PLAIN_MESSAGE).charAt(0);
        return enteredChar;
    }

    @Override
    public final String inputString() {
        String enteredString = JOptionPane.showInputDialog("Enter a string:");
        return enteredString;
    }

    @Override
    public final String inputString(final String message) {
        String enteredString = JOptionPane.showInputDialog(null, message, null, JOptionPane.PLAIN_MESSAGE);
        return enteredString;
    }
    
    @Override
    public final String inputString(final String message, String header) {
        String enteredString = JOptionPane.showInputDialog(null, message, header, JOptionPane.PLAIN_MESSAGE);
        return enteredString;
    }

}
