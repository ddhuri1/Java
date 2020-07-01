import java.util.*;

public class ShellSort 
{
    static int shellSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int gap = n/2; gap > 0; gap /= 2) 
        { 
            for (int i = gap; i < n; i += 1) 
            {  
                int temp = arr[i]; 
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                    arr[j] = arr[j - gap]; 
                arr[j] = temp; 
            } 
        } 
        return 0; 
    } 
    public static void main(String args[]) 
    { 
        System.out.println("********* SHELL SORT *********");
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
        shellSort(arr); 
        System.out.println("Sorted arrr is : "+Arrays.toString(arr));
    }
}