import java.util.*;

public class QuickSort
{
    public static void main(String[]args)
    {
        System.out.println("QUICKSORT");

        int arr[] = {1,4,3,6,4,12,3,7,65,6};
        // int arr[] = {1,14, 7, 28, 2, 19, 6};
        // int arr[] = {1,2,3,4,5};
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);
        System.out.println("Sorted arrr is : "+Arrays.toString(arr));
    }

    static void quickSort(int arr[], int low, int high)
    {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            // System.out.println("Partition : " + partitionIndex);
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
    }

    static int partition(int arr[], int begin, int end) 
    {
        int mid = ((begin+end)/2);
        
        //if using any element other than end, swap is needed
        int pivot = arr[((begin+end)/2)];
        swap(arr, mid, end);
        
        //if end and pivot no swap needed
        // int pivot = arr[end];

        int i = (begin-1);
        for (int j = begin; j < end; j++) 
        {
            if (arr[j] <= pivot) 
            {
                i++;
     
                swap(arr, i, j);
                // System.out.println("After swappig : "+Arrays.toString(arr));

            }
        }
        
        swap(arr, i+1, end);
        return i+1;
    }

    static void swap(int arr[] ,int low, int high)
    {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}