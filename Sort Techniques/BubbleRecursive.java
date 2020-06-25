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
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        System.out.println("Given array is : "+Arrays.toString(arr));
        bubbleSort(arr, arr.length); 
        System.out.println("Sorted arrr is : "+ Arrays.toString(arr));
    } 
}