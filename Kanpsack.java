public class Kanpsack
{
    public static void main(String[] args)
	{

        int val[] = new int[]{60, 100, 120}; 
        int wt[] = new int[]{10, 20, 30}; 
        int  W = 50; 
        int n = val.length;

        int i, w; 
        int K[][] = new int[n+1][W+1]; 
        
        for (i = 0; i <= W; i++) //for i=0, 1st 0th row = 0
        { 
            K[0][i] = 0;
        }
        for (i = 1; i <= n; i++) 
        { 
            for (w = 0; w <= W; w++) 
            {
                K[i][w] = 0;  //for w=0, 1st 0th col = 0
                if (wt[i-1] <= w) //include item
                    K[i][w] = Math.max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]); 
                else //exclude item
                    K[i][w] = K[i-1][w]; 
            } 
        } 

        //loop to print matrix
        // System.out.println("K matrix is : ");
        // for (int m = 0; m <= n; m++) 
        // { 
        //     for (int j = 0; j <= W; j++) 
        //     { 
        //         System.out.print("  " + K[m][j] + "  ");
        //     }
        //     System.out.print( "\n");
        // }

        System.out.println("Items taken are: ");

        int res = K[n][W];
        int items[] = new int[n+1]; 
        int item = 0;
        w = W; 
        for (i = n; i > 0 ; i--)
        { 
            if(res > 0)
            {
                if (res == K[i - 1][w]) 
                    continue; 
                else 
                {
                    System.out.print("Item: " + i + "  With weight: " + wt[i - 1] + "  With value: " + val[i - 1] + " \n"); 
                    items[item] = i;
                    item ++;
                    res = res - val[i - 1]; 
                    w = w - wt[i - 1]; 
                } 
            }  
        } 

        System.out.print("Maximum Profit is: " + K[n][W] + " \n");

        // for(int k =item - 1; k>=0; k--)
        //     {
        //         System.out.println("Items: " + items[k] + ", ");
        //     }
     
    }

}