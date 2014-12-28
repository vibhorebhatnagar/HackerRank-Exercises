import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int unsorted = ar[ar.length-1];
        int pointer = ar.length-1;
        while(pointer>=0)
        {
            if(pointer==0)
            {
                //printArray(ar);
                
                ar[pointer] = unsorted;
                printArray(ar);
                
                break;
            }
            if(ar[pointer-1]>unsorted) ar[pointer] = ar[pointer-1];
            else
            {
                ar[pointer] = unsorted;
                printArray(ar);
                break;
            }
            printArray(ar);
            
            pointer-=1;
            
        }
        
        
        
    }
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
