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
public class Program {
    public Program() {}
    
    public void StartProgram() throws IOException {
        InputFile file = new InputFile(); // The File being read
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        WelcomeGrephy(); // Displays the welcome sign
        String input = in.readLine();
        while(input != null) {
            // Ending the program
            if(input.toLowerCase().contains("exit") || input.toLowerCase().contains("quit") || 
                    input.toLowerCase().contains("end") || input.toLowerCase().contains("done")) {
                break;
            } else if(input.toLowerCase().contains("help")) {
                System.out.println("\n-----------------------------------\n"
                    + "~~~~~~~~~~~[HELP MENU]~~~~~~~~~~~~~\n"
                    + "-----------------------------------\n"
                    + "How can I help you today?");
                input = in.readLine();
                if(input.toLowerCase().contains("exit") || input.toLowerCase().contains("quit") || 
                    input.toLowerCase().contains("end") || input.toLowerCase().contains("done")) { // Ending the program
                    break;
                } else if(input.toLowerCase().contains("info")) { // Info about the program
                    System.out.println("INFO TESTER\n");
                } else if(input.toLowerCase().contains("rules")) { // Instructions on how to use program
                     
                } else if(input.toLowerCase().contains("examples")) { // Info about the program
                     
                } else { // Error message incorrect input
                    HelpErrorMessage(); // Calls the error message for the help menu
                }
            } else {
                MainErrorMessage(); // Displays error message for the main screen
            }
            
            
            WelcomeGrephy(); // Displays the welcome sign
            input = in.readLine(); // Waits for user input
        }
    }
    
    
    /**
     * Provides the error message when in the help screen
     * Gives commands for the users
     * They provide descriptions with information about the commands
     */
    private void HelpErrorMessage() {
        System.out.println("\n-----------------------------------\n"
                    + "~~~~~~~~~~~[HELP MENU]~~~~~~~~~~~~~\n"
                    + "-----------------------------------\n"
                + "Invalid \"help\" command entered.\n\n"
                + "List of commands:\n"
                + "info      : Gives information about Grephy.\n"
                + "rules     : Instructions on how to use Grephy.\n"
                + "examples  : Contains sample Regex Test Cases.\n");
    }
    
    
    /**
     * Provides the error message when in the help screen
     * Gives commands for the users
     * They provide descriptions with information about the commands
     */
    private void MainErrorMessage() {
        System.out.println("\n-----------------------------------\n" 
                + "~~~~~~~~~[ERROR DETECTED]~~~~~~~~~~\n"
                + "-----------------------------------\n"
                + "Invalid command typed.\n\n"
                + "List of commands:\n"
                + "help : Takes you to the help menu.\n"
                + "exit | end | quit | done : Ends the program.\n\n"
                + "Hit enter/return to continue...");
    }
    
    
    private void WelcomeGrephy() {
        System.out.println("\n-----------------------------------\n"
                + "~~~~~~~~WELCOME TO GREPHY!~~~~~~~~~\n"
                + "-----------------------------------\n"
                + "Enter a Regex to being:"); // Introduction
    }
    
}
