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
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
        bitonicSort(arr, 0, arr.length, 1); 
		System.out.println("Sorted array is : "+Arrays.toString(arr)); 
	} 
} 
