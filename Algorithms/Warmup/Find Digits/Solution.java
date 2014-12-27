import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try{
        input=reader.readLine();
        int testcases = Integer.parseInt(input);
        for(int loopcount=0;loopcount<testcases;loopcount++)
            {
                String N = reader.readLine();
                int number = Integer.parseInt(N);
                int length = N.length();
                int divisorcount = 0;
                for(int loopcounter=0;loopcounter<length;loopcounter++)
                    {
                        int digit = Character.getNumericValue(N.charAt(loopcounter));
                        if(digit==0) continue;
                        if(number%digit==0) divisorcount++;
                    
                }
            
                System.out.println(divisorcount);
            
        }
                
        }catch(IOException io)
            {
            io.printStackTrace();
            
        }
        
        
            
            
        }
    }
