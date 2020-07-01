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
        int arr[] = {5,4,3,2,1};
        System.out.println("Given array is : "+Arrays.toString(arr));
		oddEvenSort(arr, arr.length); 
		System.out.println(" Sorted array is : "+Arrays.toString(arr));  
	} 
} 
