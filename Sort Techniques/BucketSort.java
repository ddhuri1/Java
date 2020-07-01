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
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        int low = 0;
        int high = arr.length;
        System.out.println("Given array is : "+Arrays.toString(arr));
        sorting(arr,low,high );
        System.out.println("Sorted array is : "+Arrays.toString(arr));
    }
}