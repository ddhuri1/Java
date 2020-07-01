import java.util.*;

public class Selection
{
    static int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
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