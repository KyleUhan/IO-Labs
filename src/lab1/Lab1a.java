/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Kyle
 */
public class Lab1a {

    public static void main(String[] args) {

        File file = new File(File.separatorChar + "Users" + File.separatorChar
                + "Kyle" + File.separatorChar + "Desktop" + File.separatorChar
                + "Java" + File.separatorChar + "lab1.txt");

        BufferedReader input = null;

        try {
            input = new BufferedReader(new FileReader(file));
            String line = input.readLine();
            while (line != null) {
                System.out.println(line);
                line = input.readLine();
            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            try {
                input.close();
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}
