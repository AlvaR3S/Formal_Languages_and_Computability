/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package grephy;

import java.io.*;

/**
 *
 * @author reynaldoalvarez
 */
public class InputFile {
    public void InputFile() {}
    
    public void learnInput() {
        try (BufferedReader buffReader = new BufferedReader(new FileReader("InputFile.txt"))) { // Create the bufferedReader and take in an txt file
            while(buffReader.ready()) { // While there is still input left
                System.out.println(buffReader.readLine());
            }
        } catch(IOException e) {
            System.out.println("Could not read file.");
        }
    }
    
}
