import java.util.*;

public class BucketSort
{
    static private void sorting(int arr[], int low, int high)
    {
        ArrayList<Integer>[] bucket = new ArrayList[10];
        for (int i = 0; i < 10; i++) 
            bucket[i] = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) 
            bucket[arr[i] / 10].add(arr[i]); 
        for (ArrayList<Integer> b : bucket) 
            Collections.sort(b);
        int ptr = 0;
        for (ArrayList<Integer> b : bucket) 
            for(int value:b)
                arr[ptr++] = value;
    }
    public static void main(String[] args)
    {
        System.out.println("********* BUCKET SORT *********");
        int arr[] = {38,24,93,93,15,55,80,46,86,99,57,97,62,65,79,25,75,55,32,83,75,24,80,52,81,4,81,52,0,28};
        int low = 0;
        int high = arr.length;
        System.out.println("Given array is : "+Arrays.toString(arr));
        sorting(arr,low,high );
        System.out.println(" Sorted array is : "+Arrays.toString(arr));
    }
}