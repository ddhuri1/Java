import java.lang.*;
import java.util.*;
import java.io.*;
public class LCSubSeq
{
    public static void main(String[] args)
	{
        String b = "ABAC";
        String a = "BDAB";
        Stack<Character> stack = new Stack<>(); 
        int c[][] = new int[a.length()+1][b.length()+1];
        String s[][] = new String[a.length()+1][b.length()+1];
        for(int i = 0; i <= a.length() ; i++)
        {
            for(int j = 0; j <= b.length() ; j++)
            {
                if(i==0 || j==0)
                {
                    c[i][j] = 0;
                    s[i][j] = "-";
                    continue;
                }
                // else
                // {
                    // System.out.print("a: "+ b.charAt(i-1) + " " + "b: " + a.charAt(j-1)+ "\n");
                    if(a.charAt(i-1) == b.charAt(j-1))
                    {
                        // System.out.print("a: "+ b.charAt(i-1) + " " + "b: " + a.charAt(j-1)+ "\n");
                        c[i][j] = c[i-1][j-1] + 1; 
                        s[i][j] = "D";
                    }
                    else
                    {
                        if(c[i-1][j] == c[i][j-1])
                        {
                            c[i][j] = c[i-1][j];
                            s[i][j] = "U";
                        }
                        if(c[i-1][j] > c[i][j-1])
                        {
                            c[i][j] = c[i-1][j];
                            s[i][j] = "U";
                        }
                        if(c[i-1][j] < c[i][j-1])
                        {
                            c[i][j] = c[i][j-1];
                            s[i][j] = "L";
                        }
                    }
                }
            //}
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
        System.out.print(" Position is: "  + "\n");

        for(int i = 0; i <= a.length() ; i++)
        {
            for(int j = 0; j <= b.length() ; j++)
            {
                //System.out.print(c[i][j]);
                System.out.print(s[i][j] + "  ");
            }
            System.out.println("\n");
        }
        
        int i =a.length();
        int j = b.length();

        //PRINT LONGEST SEQ
        // while (i > 0 && j > 0) 
        // { 
        //     if(a.charAt(i-1) == b.charAt(j-1))
        //     {
        //             stack.push(a.charAt(i-1));
        //             i--;
        //             j--;
        //     }                
        //     else 
        //     {
        //         if (c[i-1][j] > c[i][j-1]) 
        //             i--; 
        //         else
        //             j--;
        //     } 
        // }
        // int size = c[a.length()-1][b.length()-1];
        // for(int n = 0; n < size; n++) 
        // { 
        //     char y = (char) stack.pop(); 
        //     System.out.println(y); 
        // } 
        
        //PRINT ALL LONGEST SEQ
        j =0; 
        int k=0;
        int size = c[a.length()-1][b.length()-1];
        System.out.print(" Length is: " + size + "\n");
       
        System.out.print(" Sequence  is: "  + "\n");
        for(int m =a.length(); m > 0 ; m--)
        {
            for(int n = b.length(); n > 0  ; n--)
            {
                if(s[m][n] == "D" && c[m][n] == size )
                {
                    j = m-1;
                    k = n-1;
                    stack.push(a.charAt(m-1));
                    while(j > 0 && k > 0) 
                    {
                        if(s[j][k] == "D")
                        {
                            stack.push(a.charAt(j-1));
                            j--;
                            k--;
                        }
                        else
                        {
                            if (s[j][k] == "U") 
                                j--; 
                            else
                                k--;
                        }
                    }
                }
                
                
                for(int w = 0; w < size; w++) 
                { 
                    if(!stack.empty())
                    {
                        char y = (char) stack.pop(); 
                        System.out.println(y); 
                    }

                }
            }
        }
    }
}