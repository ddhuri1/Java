public class CountingRods
{
    public static void main(String[] args)
	{
        int n = 8;
        int max_profit;
        int temp = 0;
        int[] profit = new int[n+1];
        profit[0] = 0;
        
        int cost[] = { 1, 5, 8, 9, 10, 17, 17, 20};
        for (int i = 1; i<=n; i++)
        {
            max_profit = -1;
            for (int j=1; j<=i; j++)
            {
                temp = cost[j-1] + profit[i-j];
                if(temp > max_profit)
                {
                    max_profit = temp;
                }
            }
            profit[i] = max_profit;
        } 
        System.out.println(profit[n]);
    }
}