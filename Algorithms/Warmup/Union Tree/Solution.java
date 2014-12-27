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
        try
        {
            input=reader.readLine();
            int cycles, doublecycles, unicycles, height=1;
            int testcases = Integer.parseInt(input);
            for(int loopcount=0;loopcount<testcases;loopcount++)
            {
                cycles=0;doublecycles=0;unicycles=0;height=1;
                cycles = Integer.parseInt(reader.readLine());
                if(cycles==0) 
                {
                    System.out.println(height);
                    continue;
                }
                for(int loopcounter=1;loopcounter<=cycles;loopcounter++)
                {
                    if(loopcounter%2==0) height++;
                    else height*=2;
                        
                    
                }
                
                System.out.println(height);
                
            }
        
        
    }catch(IOException io)
            {
                io.printStackTrace();
            
        }
    }
}