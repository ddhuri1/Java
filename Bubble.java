import java.util.*;

public class Bubble
{
    static int arr[] = {5,4,3,2,1};
    public static void main(String[] args)
    {
        boolean swap = false;
        int i, j;
        // int arr[] = {1,4,3,6,4,12,3,7,65,6};
        //int arr[] = {1,14, 7, 28, 2, 19, 6};
        
        for( i= 0; i< arr.length-1; i++)
        {
            for( j= 0; j< arr.length-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    swap(j,j+1);
                    swap = true;
                }
            }
            if(swap == false)
                break;
        }
        System.out.println("Sorted arrr is : "+Arrays.toString(arr));
    }
    static void swap(int low, int high)
    {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}