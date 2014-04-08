/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kyle
 */
public class InputGUI implements InputStrategy {

    private static final String GENERIC_INT_MESSAGE = "Enter a Number:";
    private static final String GENERIC_DOUBLE_MESSAGE = "Enter a decmial number:";
    private static final String GENERIC_CHAR_MESSAGE = "Enter a single character:";
    private static final String GENERIC_STRING_MESSAGE = "Enter a string:";

    /**
     * GUI input used for int values
     *
     * @return Int value
     * @throws ParseException Parses to int
     */
    @Override
    public final int inputInt() throws ParseException {
        int enteredInt = (Integer.parseInt(JOptionPane.showInputDialog(GENERIC_INT_MESSAGE)));
        return enteredInt;
    }

    /**
     * GUI input used for int values with option to set your own message
     *
     * @param message String custom message
     * @return Int value
     * @throws ParseException Parses to int
     */
    @Override
    public final int inputInt(final String message) throws ParseException {
        int enteredInt = (Integer.parseInt(JOptionPane.showInputDialog(null, message, null, JOptionPane.PLAIN_MESSAGE)));
        return enteredInt;
    }

    /**
     * GUI input used for int values with option to set your own message
     *
     * @param message String custom message
     * @param header String custom header
     * @return Int value
     * @throws ParseException Parses to int
     */
    @Override
    public final int inputInt(final String message, final String header) throws ParseException {
        int enteredInt = (Integer.parseInt(JOptionPane.showInputDialog(null, message, header, JOptionPane.PLAIN_MESSAGE)));
        return enteredInt;
    }

    /**
     * GUI input used for double values with option to set your own message
     *
     * @return double value
     * @throws ParseException Parses to double
     */
    @Override
    public final double inputDouble() throws ParseException {
        Double enteredDbl = (Double.parseDouble(JOptionPane.showInputDialog(GENERIC_DOUBLE_MESSAGE)));
        return enteredDbl;
    }

    /**
     * GUI input used for double values with option to set your own message
     *
     * @param message String custom message
     * @return double value
     * @throws ParseException Parses to double
     */
    @Override
    public final double inputDouble(final String message) throws ParseException {
        Double enteredDbl = (Double.parseDouble(JOptionPane.showInputDialog(null, message, null, JOptionPane.PLAIN_MESSAGE)));
        return enteredDbl;
    }

    /**
     * GUI input used for double values with option to set your own message
     *
     * @param message String custom message
     * @param header String custom header
     * @return double value
     * @throws ParseException Parses to double
     */
    @Override
    public final double inputDouble(final String message, final String header) throws ParseException {
        Double enteredDbl = (Double.parseDouble(JOptionPane.showInputDialog(null, message, header, JOptionPane.PLAIN_MESSAGE)));
        return enteredDbl;
    }

    @Override
    public final char inputChar() throws ImproperUseException {
        String userInput = JOptionPane.showInputDialog(GENERIC_CHAR_MESSAGE);
        userInput = userInput.trim();
        if (userInput.length() > 1) {
            throw new ImproperUseException();
        }
        char enteredChar = userInput.charAt(0);
        return enteredChar;
    }

    @Override
    public final char inputChar(final String message) throws ImproperUseException {
        String userInput = JOptionPane.showInputDialog(null, message, null, JOptionPane.PLAIN_MESSAGE);
        userInput = userInput.trim();
        if (userInput.length() > 1) {
            throw new ImproperUseException();
        }
        char enteredChar = userInput.charAt(0);
        return enteredChar;
    }

    /**
     * GUI input used for Char values with option to set your own message
     *
     *
     * @param message String custom message
     * @param header String custom header
     * @return Char value
     */
    @Override
    public final char inputChar(final String message, final String header) throws ImproperUseException {
        String userInput = JOptionPane.showInputDialog(null, message, header, JOptionPane.PLAIN_MESSAGE);
        userInput = userInput.trim();
        if (userInput.length() > 1) {
            throw new ImproperUseException();
        }
        char enteredChar = userInput.charAt(0);
        return enteredChar;
    }

    @Override
    public final String inputString() {
        String enteredString = JOptionPane.showInputDialog(GENERIC_STRING_MESSAGE);
        return enteredString;
    }

    @Override
    public final String inputString(final String message) {
        String enteredString = JOptionPane.showInputDialog(null, message, null, JOptionPane.PLAIN_MESSAGE);
        return enteredString;
    }

    @Override
    public final String inputString(final String message, final String header) {
        String enteredString = JOptionPane.showInputDialog(null, message, header, JOptionPane.PLAIN_MESSAGE);
        return enteredString;
    }

}
