import java.util.*;

public class ExponentialSearch {
    static int exponentialSearch(int array[], int n, int key)
     {
        if(array[0] == key) 
            return 0;
        int i = 1;
        while (i < n && array[i] <= key) 
            i = i * 2;

        return Arrays.binarySearch(array, (i / 2), Math.min(i, n), key);
      }

      public static void main(String[] args)
       {
            int array[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};
            int key = 50;
            int result = exponentialSearch(array, array.length, key);
            System.out.println("Element is present at index: " + result);
       }
}