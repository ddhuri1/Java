import java.util.*; 

class OddEvenSort 
{ 
	public static void oddEvenSort(int arr[], int n) 
	{ 
		boolean isSorted = false;  
		while (!isSorted) 
		{ 
			isSorted = true; 
			int temp =0; 
			for (int i=1; i<=n-2; i=i+2) 
			{ 
				if (arr[i] > arr[i+1]) 
				{ 
					temp = arr[i]; 
					arr[i] = arr[i+1]; 
					arr[i+1] = temp; 
					isSorted = false; 
				} 
			} 
			for (int i=0; i<=n-2; i=i+2) 
			{ 
				if (arr[i] > arr[i+1]) 
				{ 
					temp = arr[i]; 
					arr[i] = arr[i+1]; 
					arr[i+1] = temp; 
					isSorted = false; 
				} 
			} 
		} 
		return; 
	} 
	public static void main (String[] args) 
	{ 
		System.out.println("********* ODD-EVEN SORT *********");
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
		oddEvenSort(arr, arr.length); 
		System.out.println("Sorted array is : "+Arrays.toString(arr));  
	} 
} 
