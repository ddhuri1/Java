import java.util.*;

public class Selection
{
    static int arr[] = {1,14, 7, 28, 2, 19, 6};
    public static void main(String[] args)
    {
        System.out.println("********* SELECTION SORT *********");
        int i,j;
        int min = 9999;
        int in_pos= 0;
        for( i= 0; i< arr.length; i++)
        {
            min = arr[i];
            for( j= i+1; j< arr.length; j++)
            {
                if(min > arr[j])
                {
                    min = arr[j];
                    in_pos = j;
                }
            }
            if(min < arr[i])
                swap(i,in_pos);
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