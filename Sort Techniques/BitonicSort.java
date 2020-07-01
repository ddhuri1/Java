import java.util.*; 

public class BitonicSort 
{ 
	static void compAndSwap(int a[], int i, int j, int dir) 
	{ 
		if ( (a[i] > a[j] && dir == 1) || (a[i] < a[j] && dir == 0)) 
		{ 
			int temp = a[i]; 
			a[i] = a[j]; 
			a[j] = temp; 
		} 
	} 

	static void bitonicMerge(int arr[], int low, int count, int dir) 
	{ 
		if (count > 1) 
		{ 
			int k = count / 2; 
			for (int i = low; i < low + k; i++) 
				compAndSwap(arr, i, i + k, dir); 
			bitonicMerge(arr, low, k, dir); 
			bitonicMerge(arr, low + k, k, dir); 
		} 
	} 

	static void bitonicSort(int arr[], int low, int count, int dir) 
	{ 
		if (count > 1) 
		{ 
			int k = count / 2; 
			bitonicSort(arr, low, k, 1); 
			bitonicSort(arr, low + k, k, 0); 
			bitonicMerge(arr, low, count, dir); 
		} 
	} 
	public static void main(String args[]) 
	{ 
		System.out.println("********* BITONIC SORT *********");
        int arr[] = {3, 4, 5, 8, 6, 2, 80, 1};
        System.out.println("Given array is : "+Arrays.toString(arr));
        bitonicSort(arr, 0, arr.length, 1); 
		System.out.println("Sorted array is : "+Arrays.toString(arr)); 
	} 
} 
