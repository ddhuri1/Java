import java.util.*;

public class BucketSort
{
    // static int arr[] = {54,43,32,22,11};
    static int arr[] = {47, 85, 10, 45, 16, 34, 67, 80, 34, 4, 0, 99};
    //static int arr[]= {21,11,33,70,5,25,65,55};
    // static int arr[] = {1,14, 7, 28, 2, 19, 6};
    // static int arr[] = {1,2,3,4,5};


    public static void main(String[] args)
    {
        int low = 0;
        int high = arr.length;
        System.out.println("Given array is : "+Arrays.toString(arr));
        sorting(arr,low,high );
        System.out.println(" Sorted array is : "+Arrays.toString(arr));
    }

    static void sorting(int arr[], int low, int high)
    {
        ArrayList<Integer>[] bucket = new ArrayList[10];
        for (int i = 0; i < 10; i++) 
        {
            bucket[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < arr.length; i++) 
        {
            bucket[arr[i] / 10].add(arr[i]); 
        }
        for (ArrayList<Integer> b : bucket) 
        { 
            Collections.sort(b);
        }
        int ptr = 0;
        for (ArrayList<Integer> b : bucket) 
        {
            for(int value:b)
            {
                arr[ptr++] = value;
            }

        }



    }
}