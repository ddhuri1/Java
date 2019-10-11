public class ClimbingStairs
{
    public static void main(String[] args)
	{
        int k = 3;
        int n = 10;
        int[] s = new int[n+1];
        

        for(int i = 1 ; i<=k; i++)
        {
            s[i] = (int)Math.pow((double)2, (double)(i-1)); 
        }


        //s[3] = 4;
        for(int i = k+1; i<=n; i++)
        {
            for(int j = 1; j<= k; j++)
            {
                s[i] += s[i-j];
            }
            
        }
        System.out.println( s[n]);
    }
}