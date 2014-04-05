/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Kyle
 */
public class displayGUI implements DisplayStrategy{

    @Override
    public void display(String stringToDisplay) {
        JOptionPane.showMessageDialog(null, stringToDisplay, null, JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public void display(String stringToDisplay, String header) {
         JOptionPane.showMessageDialog(null, stringToDisplay, header, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) {
        DisplayStrategy ss = new displayGUI();
        ss.display("HELLO","Message");
    }
    
}
