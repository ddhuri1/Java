import java.util.Arrays; 

public class BubbleRecursive
{
    static private void bubbleSort(int arr[], int n) 
    { 
        if (n == 1)  return;  
        for (int i=0; i<n-1; i++) 
        {   
            if (arr[i] > arr[i+1]) 
            { 
                int temp = arr[i]; 
                arr[i] = arr[i+1]; 
                arr[i+1] = temp; 
            } 
        }
        bubbleSort(arr, n-1); 
    } 
    public static void main(String[] args) 
    { 
        System.out.println("********* BUBBLE SORT *********");
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
        bubbleSort(arr, arr.length); 
        System.out.println("Sorted arrr is : "+ Arrays.toString(arr));
    } 
}