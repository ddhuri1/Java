import java.util.*; 

public class StoogeSort 
{ 
	static void stoogeSort(int[] arr, int l, int h) 
	{ 
		if (l >= h) return; 
        if (arr[l] > arr[h]) 
        { 
			int t = arr[l]; 
			arr[l] = arr[h]; 
			arr[h] = t; 
		} 
        if (h - l + 1 > 2) 
        { 
			int t = (h - l + 1) / 3;  
			stoogeSort(arr, l, h - t); 
			stoogeSort(arr, l + t, h);  
			stoogeSort(arr, l, h - t); 
		} 
	} 

	public static void main(String args[]) 
	{ 
		System.out.println("********* STOOGE SORT *********");
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
		stoogeSort(arr, 0, arr.length - 1);  
		System.out.println("Sorted array is : "+Arrays.toString(arr)); 
	} 
} 
