/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grephy;


/**
 *
 * @author reynaldoalvarez
 */
public class Grephy {
    
    public Grephy() {}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputFile regex = new InputFile();
        
        System.out.println("Welcome to Grephy!\n"
                + "The Regex we will be converting is: " + regex.Input());
        
        System.out.println("The NFA conversion for this Regex: ");
    }
}
