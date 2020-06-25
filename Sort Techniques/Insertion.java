import java.util.*;

public class Insertion
{
    static int arr[] = {1,14, 7, 28, 2, 19, 6};
    static void sorting(int arr[], int low, int high)
    {
        for(int i = 1; i < high; i++)
        {
            int elem = arr[i];
            int prev = i - 1;
            while(prev>=0 && elem < arr[prev])
            {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = elem;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("********* INSERTION SORT *********");
        int low = 0;
        int high = arr.length;
        System.out.println("Given array is : "+Arrays.toString(arr));
        sorting(arr,low,high );
        System.out.println(" Sorted array is : "+Arrays.toString(arr));
    }
}