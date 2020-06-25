import java.util.*;

public class QuickSort
{
    static void quickSort(int arr[], int low, int high)
    {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
    }

    static int partition(int arr[], int begin, int end) 
    {
        int mid = ((begin+end)/2);
        int pivot = arr[((begin+end)/2)];
        swap(arr, mid, end);
        int i = (begin-1);
        for (int j = begin; j < end; j++) 
        {
            if (arr[j] <= pivot) 
            {
                i++;
                swap(arr, i, j);
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

    public static void main(String[]args)
    {
        System.out.println("********* QUICK SORT *********");
        int arr[] = {1,4,3,6,4,12,3,7,65,6};
        System.out.println("Given array is : "+Arrays.toString(arr));
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);
        System.out.println("Sorted arrr is : "+Arrays.toString(arr));
    }
}