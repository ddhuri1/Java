import java.util.*;

public class CountingSort
{
    static int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};

    static void sorting(int arr[], int low, int high)
    {
        int max=-1;
        for(int i=0;i<high;i++)
            if(max < arr[i])
                max = arr[i];
        int sorted[] = new int[max];
        int count[] = new int[max +1];
        for(int i=0;i<high;i++)
            count[i] = 0;        
        for(int i=0;i<high;i++)
            count[arr[i]] = count[arr[i]] + 1;
        int ptr = 0;
        for (int i=0; i<=high; i++) 
        {
            int j = count[i];
                while(j != 0)
                {
                    sorted[ptr] = i;
                    ptr++;
                    j--;
                }
        }
        System.out.println("Sorted array is : "+Arrays.toString(sorted));
    }
    public static void main(String[] args)
    {
        System.out.println("********* COUNTING SORT *********");
        int low = 0;
        int high = arr.length;
        System.out.println("Given array is : "+Arrays.toString(arr));
        sorting(arr,low,high );
    }

}