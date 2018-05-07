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
    public TestCase regexCase;
    public String string;
    
    
    public Regex(TestCase regexCase, String string) {
        this.regexCase = regexCase;
        this.string = string;
    }
    
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
    

    public Regex() throws IOException {
        InputFile file = new InputFile(); // The File being read
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int matchedCount = 0;
        ArrayList<String> matchedString = new ArrayList<String>();
        
        StringBuilder regexBuffer = new StringBuilder();
        for(TestCase regex: TestCase.values()) { // Loops through the Regex values and appends the format
            regexBuffer.append(String.format("|(?<%s>%s)",regex.name(), regex.pattern));
        }
        // By using the String Builder we are able to grab the values from the enum class assign those cases to our Pattern in this class
        Pattern regexPattern = Pattern.compile(regexBuffer.substring(1), Pattern.CASE_INSENSITIVE);
         
        Matcher regexMatcher = regexPattern.matcher(file.Input());
        
        System.out.println("The input file being read is: " + file.Input() + "\n");
        while(regexMatcher.find()) {
            if(regexMatcher.group(regexCase.regex1.name()) != null) {
                matchedString.add(regexMatcher.group(TestCase.regex1.name()));
                if(!"".equals(regexCase.regex1.toString())) {
                    matchedCount++;
                }
            } else if(regexMatcher.group(regexCase.EOL.name()) != null) {
                continue;
            } else {
                
            }
        }
        
        
        System.out.println("The selected Regex matched: " + matchedCount + " times.");
        
        // CREATE arraylist to save matches found
        // Create Matcher and Pattern
        // Every time a match is found increment matchedCount
    }
    
    //---------GETTERS-------------
    public TestCase getRegexCase() {
        return regexCase;
    }
}
