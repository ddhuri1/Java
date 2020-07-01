import java.util.*; 

class PancakeSort
{ 
	static int pancakeSort(int arr[], int n) 
	{ 
		for (int curr_size = n; curr_size > 1; --curr_size) 
		{ 
			int mi = findMax(arr, curr_size); 
			if (mi != curr_size-1) 
			{ 
				flip(arr, mi); 
				flip(arr, curr_size-1); 
			} 
		} 
		return 0; 
    } 
    
    static void flip(int arr[], int i) 
	{ 
		int temp, start = 0; 
		while (start < i) 
		{ 
			temp = arr[start]; 
			arr[start] = arr[i]; 
			arr[i] = temp; 
			start++; 
			i--; 
		} 
	} 

	static int findMax(int arr[], int n) 
	{ 
		int mi, i; 
		for (mi = 0, i = 0; i < n; ++i) 
			if (arr[i] > arr[mi]) 
				mi = i; 
		return mi; 
	} 

	public static void main (String[] args) 
	{ 
        System.out.println("********* PANCAKE SORT *********");
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
		pancakeSort(arr, arr.length); 
		System.out.println("Sorted array is : "+Arrays.toString(arr));
	} 
} 
