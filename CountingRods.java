public class CountingRods
{
    public static void main(String[] args)
	{
        int n = 5;
        int max_profit;
        int temp = 0;
        int[] profit = new int[n+1];
        profit[0] = 0;
        int[] s = new int[n+1];
        // int cost[] = { 1, 5, 8, 9, 10, 17, 17, 20};
        // int cost[] = {2, 3, 7, 8, 10};
        int cost[] = { 5, 24, 36, 9, 10 };
        for (int i = 1; i<=n; i++)
        {
            max_profit = -1;
            for (int j=1; j<=i; j++)
            {
                temp = cost[j-1] + profit[i-j];
                if(temp > max_profit)
                {
                    max_profit = temp;
                    s[i] = j;
                }
            }
            profit[i] = max_profit;
        } 
        int leng = n;
        while (leng>0)
        {
            System.out.println("Len is :" + s[leng]);
            leng = leng-s[leng];
        }
        System.out.println(profit[n]);
    }
}