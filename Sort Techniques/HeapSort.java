import java.util.*;

public class HeapSort 
{
    static private void heapSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i); 
        for (int i=n-1; i>0; i--) 
        { 
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
            heapify(arr, i, 0); 
        } 
    } 

    static private void heapify(int arr[], int n, int i) 
    { 
        int largest = i;  
        int l = 2*i + 1; 
        int r = 2*i + 2; 
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
        if (largest != i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
            heapify(arr, n, largest); 
        } 
    } 
    public static void main(String args[]) 
    { 
        System.out.println("********* HEAP SORT *********");
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));  
        heapSort(arr); 
        System.out.println("Sorted array is : "+Arrays.toString(arr));

    }
}