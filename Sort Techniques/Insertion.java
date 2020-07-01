import java.util.*;

public class Insertion
{
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
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        int low = 0;
        int high = arr.length;
        System.out.println("Given array is : "+Arrays.toString(arr));
        sorting(arr,low,high );
        System.out.println("Sorted array is : "+Arrays.toString(arr));
    }
}