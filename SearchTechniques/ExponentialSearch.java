import java.util.*;

public class ExponentialSearch {
    static int exponentialSearch(int arr[], int n, int key)
     {
        if(arr[0] == key) 
            return 0;
        int i = 1;
        while (i < n && arr[i] <= key) 
            i = i * 2;

        return Arrays.binarySearch(arr, (i / 2), Math.min(i, n), key);
      }

      public static void main(String[] args)
       {
            int arr[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};
            int key = 112;
            int result = exponentialSearch(arr, arr.length, key);
            if (result < 0)  
                System.out.println(key +" is not found!");  
            else  
                System.out.println(key +" is found at index: "+ result);  
       }
}