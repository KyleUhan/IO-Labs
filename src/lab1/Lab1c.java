/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Kyle
 */
public class Lab1c {

    public static void main(String[] args) {
        boolean append = true;

        File file = new File(File.separatorChar + "Users" + File.separatorChar
                + "Kyle" + File.separatorChar + "Desktop" + File.separatorChar
                + "Java" + File.separatorChar + "lab1.txt");

        BufferedReader input = null;
        PrintWriter output = null;

        try {
            input = new BufferedReader(new FileReader(file));
            output = new PrintWriter(new BufferedWriter(new FileWriter(file, append)));
            String line = input.readLine();

            output.println("Tommy");
            output.println("TwoTone");
            output.println("555 Music ln");
            output.println("Detroit");
            output.println("MI");
            output.println("55555");

            output.close();

            String line2 = input.readLine();
            while (line2 != null) {
                System.out.println(line2);
                line2 = input.readLine();
            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            try {
                input.close();
                output.close();
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}
