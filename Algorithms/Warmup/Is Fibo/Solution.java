import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
    static List<Long> FiboSeries = new ArrayList<Long>();
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        PopulateSeries();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try
        {
            input=reader.readLine();
            int testcases = Integer.parseInt(input);
            for(int loopcount=0;loopcount<testcases;loopcount++)
                {
                    input = reader.readLine();
                    long inputnumber = Long.parseLong(input);
                    if(FiboSeries.contains(inputnumber)) System.out.println("IsFibo");
                    else System.out.println("IsNotFibo");
                }
        
        }
        catch(IOException io)
        {
                io.printStackTrace();
        }
    
    
    }
    
    static void PopulateSeries()
        {
            FiboSeries.add((long)1);
            FiboSeries.add((long)1);
            while(FiboSeries.size()<50)
                {
                    FiboSeries.add(FiboSeries.get(FiboSeries.size()-1)+FiboSeries.get(FiboSeries.size()-2));
                }
        }
    
            
}