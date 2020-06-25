import java.util.*;

public class CandyCrush1
{
   
    static String arr = "";


    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        if(arr == null || arr.length() == 0)
        { 
            sb.append("");
            String str = sb.toString();
            System.out.println(str);
            return;
        }
        Stack<Character> ch = new Stack<>();
        Stack<Integer> in = new Stack<>();
        ch.push(arr.charAt(0));
        in.push(1);
        for(int i =1; i < arr.length(); i++)
        {
            if( in.peek() >= 3)
            {
                in.pop();
                ch.pop();
            }
            if(ch.isEmpty() || arr.charAt(i) != ch.peek())
            {
                int count = 1;
                
                ch.push(arr.charAt(i));
                in.push(count);
            }
            else if(!ch.isEmpty() && arr.charAt(i) == ch.peek())
            {
                int count = in.pop();
                count++;
                in.push(count);
                char c = ch.pop();
                ch.push(c);
            }

        }
        if(!ch.isEmpty() && in.peek() >= 3) 
        {
            in.pop();
            ch.pop();
        }
        while(!in.isEmpty())
        {
            int cou = in.pop();
            char cc = ch.pop();
            while(cou != 0)
            {
                sb.append(cc);
                cou--;
            }
        }
        String str = sb.reverse().toString();
        System.out.println(str);
    }
}