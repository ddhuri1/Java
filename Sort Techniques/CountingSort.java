import java.util.*;

public class CountingSort
{
    static int arr[] = {5,4,3,2,1};
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
        System.out.println(" Sorted array is : "+Arrays.toString(sorted));
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