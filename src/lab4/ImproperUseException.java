/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4;

/**
 *
 * @author Kyle
 */
public class ImproperUseException extends IllegalArgumentException{

    private final static String EXCEPTION_MESSAGE = "Use 'inputString' for more than one character.";
    
    public ImproperUseException() {
        super(EXCEPTION_MESSAGE);
    }

    public ImproperUseException(final String s) {
        super(EXCEPTION_MESSAGE);
    }

    public ImproperUseException(final String message,final Throwable cause) {
        super(EXCEPTION_MESSAGE, cause);
    }

    public ImproperUseException(final Throwable cause) {
        super(cause);
    }
    
    
    
}
