/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

/**
 *
 * @author Kyle
 */
public interface DisplayStrategy {
    
    public abstract void display(String stringToDisplay);
    
    public abstract void display(String stringToDisplay, String header);
    
}
