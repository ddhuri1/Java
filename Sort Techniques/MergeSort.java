import java.util.*;

public class MergeSort
{
    static int arr[] = {5,4,3,2,1};
    static void mergeSort(int arr[], int low, int high)
    {
        if(high > low)
        {
            int mid = (low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            sortArray(arr,low,mid,high);
        }
    }

    static void sortArray(int arr[], int low, int mid, int high)
    {

        int lenghta = mid - low + 1;
        int lenghtb = high - mid ;
        int arra[] = new int[lenghta ];
        int arrb[] = new int[lenghtb];

        for(int i = 0; i< lenghta; ++i)
        {
            arra[i] = arr[low + i];
        }
        for(int j = 0; j< lenghtb; ++j)
        {
            arrb[j] = arr[mid + 1 + j];
        }
        
        int i = 0;
        int j = 0;
        int ptr = low;
        while(i < lenghta && j < lenghtb)
        {
            if(arra[i] <= arrb[j])
            {
                arr[ptr] = arra[i];
                i++;
            }
            else
            {
                arr[ptr] = arrb[j];
                j++;
            }
            ptr++;
        }

        while (i < lenghta) 
        { 
            arr[ptr] = arra[i]; 
            i++; 
            ptr++; 
        } 
  
        while (j < lenghtb) 
        { 
            arr[ptr] = arrb[j]; 
            j++; 
            ptr++; 
        } 
    }

    public static void main(String[] args)
    {
        System.out.println("********* MERGE SORT *********");
        int low = 0;
        int high = arr.length;
        System.out.println("Given array is : "+Arrays.toString(arr));
        mergeSort(arr,low,high - 1);
        System.out.println(" Sorted array is : "+Arrays.toString(arr));
    }
}