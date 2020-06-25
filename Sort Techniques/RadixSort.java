import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort
{
    static void radixSort(int arr[], int low, int high)
    {
        final int radix = 10;
        boolean value = false;
        List<Integer>[] bucket = new ArrayList[radix];
    
        for (int i = 0; i < bucket.length; i++) 
            bucket[i] = new ArrayList<Integer>();
        int temp= -1;
        int digit = 1;
        while(!value)
        {
            value = true;
            
            for(Integer a: arr)
            {
                temp = a/digit;
                bucket[temp % radix].add(a);
                if(temp > 0 && value)
                    value = false;
            }
        
            int ptr = 0;
            for(int i=0;i<radix;i++)
            {
                for(int b:bucket[i])
                    arr[ptr++] = b;
                bucket[i].clear();

            }
            digit = digit * 10;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("********* RADIX SORT *********");
        int[] arr = {5, 2, 6, 13, 15, 43, 23, 88};
        int low = 0;
        int high = arr.length;
        System.out.println("Given array is : "+Arrays.toString(arr));
        radixSort(arr,low,high );
        System.out.println(" Sorted array is : "+Arrays.toString(arr));
    }

}