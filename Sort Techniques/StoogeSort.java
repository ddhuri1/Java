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
        int arr[] = {5,4,3,2,1};
        System.out.println("Given array is : "+Arrays.toString(arr));
		stoogeSort(arr, 0, arr.length - 1);  
		System.out.println("Sorted array is : "+Arrays.toString(arr)); 
	} 
} 
