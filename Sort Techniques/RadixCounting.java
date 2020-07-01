import java.util.Arrays;

public class RadixCounting
{
    
    static void radixSort(int arr[], int digit)
    {
        int output[] = new int[arr.length];
        int count[] = new int[10];
        Arrays.fill(count,0);
        for(int i = 0; i< arr.length;i++)
        {
            int value = (arr[i]/digit)%10;
            count[value]++;
        }
        for(int i = 1; i< 10;i++)
            count[i] += count[i-1];
        for(int i = arr.length -1; i>= 0;i--)
        {
            int value = (arr[i]/digit)%10;
            output[count[value] - 1] = arr[i];
            count[value]--;
        }
        for(int i = 0; i< arr.length;i++)
            arr[i] = output[i];
    }
    public static void main(String[] args)
    {
        System.out.println("********* RADIX-COUNTING SORT *********");
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
        int max = arr[0];
        for(int i = 1; i< arr.length;i++)
            if(arr[i] > max)
                max = arr[i];
        for(int digit = 1; max/digit > 0 ; digit*=10)
        radixSort(arr,digit );
        System.out.println("Sorted array is : "+Arrays.toString(arr));
    }
}