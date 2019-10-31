import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixCounting
{
    // static int arr[] = {5,4,3,2,1};
    //static int arr[] = {1,2,3,4,5};
    public static void main(String[] args)
    {
        // int[] arr = {181, 51, 11, 33, 11, 39, 60, 2, 27, 24, 12};
        // int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        int[] arr = {5, 2, 6, 13, 15, 43, 23, 808};
        // int[] arr = {306, 42, 87, 91, 22, 7};

        System.out.println("Given array is : "+Arrays.toString(arr));

        int max = arr[0];
        //find max
        for(int i = 1; i< arr.length;i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }

        //for every digit...digit =1, 91/1= 91....91%10 = 1..ie unitys place
        //digit = 10....91/10 = 9....9%10 = 9 ie 10's place
        for(int digit = 1; max/digit > 0 ; digit*=10)
        {
            sorting(arr,digit );
        }
        System.out.println(" Sorted array is : "+Arrays.toString(arr));
    }

    static void sorting(int arr[], int digit)
    {
        int output[] = new int[arr.length];
        int count[] = new int[10];
        Arrays.fill(count,0);

        //find count of each digit place
        for(int i = 0; i< arr.length;i++)
        {
            int value = (arr[i]/digit)%10;
            count[value]++;
        }

        //add current and previous count to get actual position
        for(int i = 1; i< 10;i++)
        {
            count[i] += count[i-1];
        }

        //place the value of array in actual position
        //start from behind to place in last position as the count keeps decrementing
        for(int i = arr.length -1; i>= 0;i--)
        {
            int value = (arr[i]/digit)%10;
            output[count[value] - 1] = arr[i];
            count[value]--;
        }

        //copy to main array
        for(int i = 0; i< arr.length;i++)
        {
            arr[i] = output[i];
        }
    }
}