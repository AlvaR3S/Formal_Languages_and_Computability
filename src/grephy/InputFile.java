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
    private String regexOutput;
    
    public void InputFile() {}
    
    public String Input() {
        try (BufferedReader buffReader = new BufferedReader(new FileReader("InputFile.txt"))) { // Create the bufferedReader and take in an txt file
            while(buffReader.ready()) { // While there is still input left
                regexOutput = buffReader.readLine();
            }
        } catch(IOException e) {
            System.out.println("Could not read file.");
        }
        return regexOutput;
    }
    
}
