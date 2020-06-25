import java.util.*;

public class Bubble
{
    static int arr[] = {5,4,3,2,1};
    public static void main(String[] args)
    {
        System.out.println("Given array is : "+Arrays.toString(arr));
        boolean swap = false;
        int i, j;
        for( i= 0; i< arr.length-1; i++)
        {
            for( j= 0; j< arr.length-i-1; j++)
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
    static private void swap(int low, int high)
    {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}