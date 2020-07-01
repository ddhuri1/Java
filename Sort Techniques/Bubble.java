import java.util.*;

public class Bubble
{
    static int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
    public static void main(String[] args)
    {
        System.out.println("********* BUBBLE SORT *********");
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