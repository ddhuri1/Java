import java.util.*;

public class ThreeWayMerge 
{
    public static void threeWayMergeSort(Integer[] arr) 
    { 
        if (arr == null) return; 
        Integer[] res = new Integer[arr.length]; 
        for (int i = 0; i < res.length; i++) 
            res[i] = arr[i]; 
        mergeSort3WayRec(res, 0, arr.length, arr); 
        for (int i = 0; i < res.length; i++) 
            arr[i] = res[i]; 
    } 
  
    public static void mergeSort3WayRec(Integer[] arr, int low, int high, Integer[] result) 
    { 
        if (high - low < 2) return; 
        int mid1 = low + ((high - low) / 3); 
        int mid2 = low + 2 * ((high - low) / 3) + 1; 
        mergeSort3WayRec(result, low, mid1, arr); 
        mergeSort3WayRec(result, mid1, mid2, arr); 
        mergeSort3WayRec(result, mid2, high, arr); 
        merge(result, low, mid1, mid2, high, arr); 
    } 

    public static void merge(Integer[] arr, int low, int mid1, int mid2, int high,  Integer[] result) 
    { 
        int i = low, j = mid1, k = mid2, l = low; 
        while ((i < mid1) && (j < mid2) && (k < high)) 
        { 
            if (arr[i].compareTo(arr[j]) < 0) 
            { 
                if (arr[i].compareTo(arr[k]) < 0) 
                    result[l++] = arr[i++]; 
  
                else
                    result[l++] = arr[k++]; 
            } 
            else
            { 
                if (arr[j].compareTo(arr[k]) < 0) 
                    result[l++] = arr[j++]; 
                else
                    result[l++] = arr[k++]; 
            } 
        } 
        while ((i < mid1) && (j < mid2)) 
        { 
            if (arr[i].compareTo(arr[j]) < 0) 
                result[l++] = arr[i++]; 
            else
                result[l++] = arr[j++]; 
        } 
        while ((j < mid2) && (k < high)) 
        { 
            if (arr[j].compareTo(arr[k]) < 0) 
                result[l++] = arr[j++]; 
  
            else
                result[l++] = arr[k++]; 
        } 
        while ((i < mid1) && (k < high)) 
        { 
            if (arr[i].compareTo(arr[k]) < 0) 
                result[l++] = arr[i++]; 
            else
                result[l++] = arr[k++]; 
        } 
        while (i < mid1) 
            result[l++] = arr[i++]; 
        while (j < mid2) 
            result[l++] = arr[j++]; 
        while (k < high) 
            result[l++] = arr[k++]; 
    } 
    public static void main(String args[]) 
    { 
        System.out.println("********* 3 Way Merge SORT *********");
        Integer[] arr = new Integer[] {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
        threeWayMergeSort(arr); 
        System.out.println("Sorted array is : "+Arrays.toString(arr));
    } 
} 