import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort
{
    // static int arr[] = {5,4,3,2,1};
    //static int arr[] = {1,2,3,4,5};
    public static void main(String[] args)
    {
        // int[] arr = {181, 51, 11, 33, 11, 39, 60, 2, 27, 24, 12};
        // int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        int[] arr = {5, 2, 6, 13, 15, 43, 23, 88};
        int low = 0;
        int high = arr.length;
        System.out.println("Given array is : "+Arrays.toString(arr));
        sorting(arr,low,high );
        System.out.println(" Sorted array is : "+Arrays.toString(arr));
    }

    static void sorting(int arr[], int low, int high)
    {
        final int radix = 10;
        boolean value = false;
        List<Integer>[] bucket = new ArrayList[radix];
    
        for (int i = 0; i < bucket.length; i++) 
        {
            bucket[i] = new ArrayList<Integer>();
        }
        int temp= -1;
        int digit = 1; //units place initially
        while(!value)
        {
            value = true;
            
            for(Integer a: arr)
            {
                temp = a/digit;
                bucket[temp % radix].add(a);
                if(temp > 0 && value)
                {
                    value = false;
                }
            }
        
            int ptr = 0;
            for(int i=0;i<radix;i++)
            {
                for(int b:bucket[i])
                {
                    arr[ptr++] = b;
                }
                bucket[i].clear();

            }
            digit = digit * 10;
        }

    }
}