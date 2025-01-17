import java.util.*; 

class TimSort 
{ 
	static int RUN = 32; 
	public static void timSort(int[] arr, int n) 
	{ 
		for (int i = 0; i < n; i += RUN) 
		{ 
			insertionSort(arr, i, Math.min((i + 31), (n - 1))); 
		} 
		for (int size = RUN; size < n; size = 2 * size) 
		{ 
			for (int left = 0; left < n; left += 2 * size) 
			{ 
				int mid = left + size - 1; 
				int right = Math.min((left + 2 * size - 1), (n - 1)); 
				merge(arr, left, mid, right); 
			} 
		} 
    } 
    
    public static void insertionSort(int[] arr, int left, int right) 
	{ 
		for (int i = left + 1; i <= right; i++) 
		{ 
			int temp = arr[i]; 
			int j = i - 1; 
			while (j >= left && arr[j] > temp) 
			{ 
				arr[j + 1] = arr[j]; 
				j--; 
			} 
			arr[j + 1] = temp; 
		} 
	} 

	public static void merge(int[] arr, int l, int m, int r) 
	{ 
		int len1 = m - l + 1, len2 = r - m; 
		int[] left = new int[len1]; 
		int[] right = new int[len2]; 
		for (int x = 0; x < len1; x++) 
		{ 
			left[x] = arr[l + x]; 
		} 
		for (int x = 0; x < len2; x++) 
		{ 
			right[x] = arr[m + 1 + x]; 
		} 

		int i = 0; 
		int j = 0; 
		int k = l; 
		while (i < len1 && j < len2) 
		{ 
			if (left[i] <= right[j]) 
			{ 
				arr[k] = left[i]; 
				i++; 
			} 
			else
			{ 
				arr[k] = right[j]; 
				j++; 
			} 
			k++; 
		} 
		while (i < len1) 
		{ 
			arr[k] = left[i]; 
			k++; 
			i++; 
		} 
		while (j < len2) 
		{ 
			arr[k] = right[j]; 
			k++; 
			j++; 
		} 
	} 
	public static void main(String[] args) 
	{ 
        System.out.println("********* TIM SORT *********");
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
		timSort(arr, arr.length); 
		System.out.println("Sorted array is : "+Arrays.toString(arr)); 
	} 
} 