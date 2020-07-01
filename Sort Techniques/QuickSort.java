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
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);
        System.out.println("Sorted arrr is : "+Arrays.toString(arr));
    }
}