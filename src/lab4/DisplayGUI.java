/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4;

import javax.swing.JOptionPane;

/**
 *
 * @author Kyle
 */
public class DisplayGUI implements DisplayStrategy{
    
    @Override
    public final void display(final String stringToDisplay){
         JOptionPane.showMessageDialog(null, stringToDisplay, null, JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public final void display(final String stringToDisplay,final String header) {
         JOptionPane.showMessageDialog(null, stringToDisplay, header, JOptionPane.INFORMATION_MESSAGE);
    }
    
}
