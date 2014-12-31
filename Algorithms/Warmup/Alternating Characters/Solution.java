import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
        int testcases = Integer.parseInt(reader.readLine());
        String testString;
        while((testString = reader.readLine())!=null)
        {
            int deletions=0, indexpointer1=0, indexpointer2=indexpointer1+1;
            while(indexpointer1<testString.length()&&indexpointer2<testString.length())
            {
                if(testString.charAt(indexpointer1)!=testString.charAt(indexpointer2))
                {
                    indexpointer1 = indexpointer2;
                    indexpointer2=indexpointer1+1;
                }
                else 
                {
                    deletions++;
                    indexpointer2++;
                }
            }
                
            System.out.println(deletions);    
        }}catch(IOException io)
            {
                io.printStackTrace();
            
        }
            
            
        }
        
    }