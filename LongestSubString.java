import java.lang.*;
import java.util.*;
import java.io.*;
public class LongestSubString
{
    public static void main(String[] args)
	{
        Stack<Character> stack = new Stack<>(); 
        String b = "BEEFDEAD";
        // String b = "DEADBEEF";
        String a = "EATBEEF";
        // String a = "EATBEEF";
        int ipos = 0, jpos = 0;
        int max = 0; 
        int c[][] = new int[a.length()+1][b.length()+1];
        for(int i = 0; i <= a.length() ; i++)
        {
            for(int j = 0; j <= b.length() ; j++)
            {
                if(i==0 || j==0)
                {
                    c[i][j] = 0;
                    continue;
                }
                if(a.charAt(i-1) == b.charAt(j-1))
                {
                    // System.out.print("a: "+ b.charAt(i-1) + " " + "b: " + a.charAt(j-1)+ "\n");
                    c[i][j] = c[i-1][j-1] + 1;
                    if(c[i][j] > max)
                    {
                        max = c[i][j];
                        ipos = i;
                        jpos = j;
                    } 
                }
                else
                {
                    c[i][j] = 0;
                }
            }
        }
        //System.out.println(Arrays.deepToString(c));
        //System.out.println(Arrays.deepToString(s));
        System.out.print(" Matrix is: "  + "\n");
        for(int i = 0; i <= a.length() ; i++)
        {
            for(int j = 0; j <= b.length() ; j++)
            {
                System.out.print(c[i][j] + "  ");
                //System.out.print(s[i][j]);
            }
            System.out.println("\n");
        }
        int size = max;
        int l =ipos;
        int m = jpos;
        while(l > 0 && m > 0 && size > 0)
        {
            stack.push(b.charAt(m-1));
            l--;
            m--;
            size --;
        }
        System.out.print("Longest Sub String length is: " + max + " and the string is: "); 
        for(int w = 0; w < max; w++) 
        { 
            if(!stack.empty())
            {
                char y = (char) stack.pop(); 
                System.out.print(y + " "); 
            }

        }
        
    }
}