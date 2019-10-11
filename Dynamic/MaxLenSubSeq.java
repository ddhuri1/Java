import java.util.Arrays; 
import java.util.Collections; 

public class MaxLenSubSeq
{
    public static void main(String[] args)
	{
        int max_profit;
        int temp = 0, head = 0, tail = 0;
        // int cost[] = { -2,1,-3,4,-1,2,1,-5,4 };
        int cost[] = { -2, -1, 5, -1, 4, 0, 3};
        int n =cost.length;
        Integer[] profit = new Integer[cost.length + 1];
        profit[0] = 0;
        // int cost[] = { 1, 5, 8, 9, 10, 17, 17, 20};
        // int cost[] = {2, 3, 7, 8, 10};
        int i = 0;
        profit[0] = cost[0];
        System.out.println(profit[0]);

        for (i = 1; i<n; i++)
        {
            if(cost[i] + profit[i-1] > cost[i])
            {
                profit[i] = cost[i] + profit[i-1] ;
                tail ++;
            }
            else
            {
                profit[i] = cost[i];
                head = i;
                tail = i;
            }
        } 
        System.out.print("Result array is: [ ");
        max_profit = profit[0];
        for (i = 1; i<n; i++)
        {
            System.out.print( profit[i] + ", ");
            if(profit[i] > max_profit)
            { 
                max_profit = profit[i]; 
                tail = i;
             } 
        }
        System.out.println(" ] \n");

        System.out.print("Maximum Length of sub String is: " + max_profit + " With sequence as: ");
        for (i = head; i<=tail; i++)
        {
            System.out.print(cost[i] + ", ");
        }


    }
}