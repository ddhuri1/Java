import java.util.Arrays; 

public class InsersionRecursive
{
    static void insertionSortRecursive(int arr[], int n) 
    { 
        if (n <= 1) return; 
        
        insertionSortRecursive( arr, n-1 );  
        int last = arr[n-1]; 
        int j = n-2; 
        while (j >= 0 && arr[j] > last) 
        { 
            arr[j+1] = arr[j]; 
            j--; 
        } 
        arr[j+1] = last; 
    } 
    public static void main(String[] args) 
    { 
        System.out.println("********* INSERTION SORT *********");
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
        insertionSortRecursive(arr, arr.length); 
        System.out.println("Sorted array is : "+Arrays.toString(arr)); 
    } 
}