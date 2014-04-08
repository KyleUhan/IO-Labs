/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.text.ParseException;

/**
 *
 * @author Kyle
 */
public interface InputStrategy {

    abstract public int inputInt() throws ParseException;

    abstract public int inputInt(final String message) throws ParseException;

    abstract public int inputInt(final String message, String header) throws ParseException;

    abstract public double inputDouble() throws ParseException;

    abstract public double inputDouble(final String message) throws ParseException;

    abstract public double inputDouble(final String message, final String header) throws ParseException;

    abstract public char inputChar();

    abstract public char inputChar(final String message);

    abstract public char inputChar(final String message, final String header);

    abstract public String inputString();

    abstract public String inputString(final String message);

    abstract public String inputString(final String message, final String header);

}
