/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grephy;

import java.util.ArrayList;
import java.util.regex.*;
import java.io.*;

/**
 *
 * @author reynaldoalvarez
 */
public class Regex {
    
    public Regex()  {}
    
    public TestCase regexCase;
    
    public static enum TestCase {
        // Regex Example 1
        regex1("(ab)*"),
        
        // End of the first line/program
        EOL("\n");
        
        Pattern pattern;
        
        private TestCase(String pattern) {
            this.pattern = Pattern.compile(pattern);
        }
    }
    
    public void MatchedRegex() throws IOException {
        InputFile file = new InputFile(); // The File being read
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int matchedCount = 0;
        ArrayList<String> matchedString = new ArrayList<String>();
        Matcher regexMatcher = regexCase.pattern.matcher(file.Input());
        
        System.out.println("The input file being read is: " + file.Input() + "\n");
        while(regexMatcher.find()) {
            if(regexMatcher.group(regexCase.regex1.name()) != null) {
                matchedString.add(file.Input());
            } else if(regexMatcher.group(regexCase.EOL.name()) != null) {
                continue;
            } else {
                
            }
        }
        
        System.out.println("The selected Regex matched: " + matchedString.size() + " times.");
        
        // CREATE arraylist to save matches found
        // Create Matcher and Pattern
        // Every time a match is found increment matchedCount
    }
    
    
    //---------GETTERS-------------
    public TestCase getRegexCase() {
        return regexCase;
    }
}
