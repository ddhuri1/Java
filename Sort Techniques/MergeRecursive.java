import java.util.Arrays; 

public class MergeRecursive 
{
    static void mergeSort(int[] arr) 
    {
        if(arr == null) return;   
        if(arr.length > 1) 
        { 
            int mid = arr.length / 2; 
            int[] left = new int[mid]; 
            for(int i = 0; i < mid; i++) 
                left[i] = arr[i]; 
            int[] right = new int[arr.length - mid]; 
            for(int i = mid; i < arr.length; i++) 
                right[i - mid] = arr[i]; 
            mergeSort(left); 
            mergeSort(right); 
            
            int i = 0; 
            int j = 0; 
            int k = 0; 
  
            while(i < left.length && j < right.length) 
            { 
                if(left[i] < right[j]) 
                { 
                    arr[k] = left[i]; 
                    i++; 
                } 
                else
                { 
                    arr[k] = right[j]; 
                    j++; 
                } 
                k++; 
            } 
            while(i < left.length) 
            { 
                arr[k] = left[i]; 
                i++; 
                k++; 
            } 
            while(j < right.length) 
            { 
                arr[k] = right[j]; 
                j++; 
                k++; 
            } 
        } 
    } 
    public static void main(String[] args) 
    { 
        System.out.println("********* MERGE SORT *********");
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
        mergeSort(arr); 
        System.out.println("Sorted array is : "+Arrays.toString(arr)); 
    } 
}