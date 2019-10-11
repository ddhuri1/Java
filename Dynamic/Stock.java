public class Stock
{
    public static void main(String[] args)
	{
        // int price[] = {7,6,1,3,10,4};
        int price[] = {7,6,5,1,3,10,4};
        // int price[] = {7,1,5,3,6,4};
        int size = price.length;
        int min = price[0];
        int r[] = new int[size+1];
        r[0] = 0;
        int buy = 0;
        int sell = 0;
        int buyC = 0;
        int sellC= 0;
        for(int i = 1; i< size ; i++)
        {
            r[i] = r[i-1];
            if(price[i] < min)
            {
                min = price[i];
                buy = i+1;
                buyC = price[i];
            }
            if(r[i-1] <  price[i] - min)
            {
                r[i] = price[i] - min;
                sell = i+1;
                sellC = price[i];
            }
        }
        System.out.println("Max profit is " + r[size-1]);
        System.out.println("Buy on day " + buy + " With cost " + buyC );
        System.out.println("Sell on day " + sell + " With cost " + sellC );
    }
}