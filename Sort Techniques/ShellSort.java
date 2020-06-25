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
        int arr[] = {5,4,3,2,1}; 
        System.out.println("Given array is : "+Arrays.toString(arr));
        shellSort(arr); 
        System.out.println("Sorted arrr is : "+Arrays.toString(arr));
    }
}