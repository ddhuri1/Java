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
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        int low = 0;
        int high = arr.length;
        System.out.println("Given array is : "+Arrays.toString(arr));
        radixSort(arr,low,high );
        System.out.println("Sorted array is : "+Arrays.toString(arr));
    }

}