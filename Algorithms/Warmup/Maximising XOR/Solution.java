import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
/*
 * Complete the function below.
 */

    static int maxXor(int l, int r) {
        int max=0;
        for(int counter1=l;counter1<=r;counter1++)
        {
                for(int counter2=l;counter2<=r;counter2++)
                {
                    if((counter1^counter2) > max) max = counter1^counter2;            
                    
                }
            
        }
        return max;    
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
