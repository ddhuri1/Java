import java.util.*; 

class CombSort 
{ 
	static void combSort(int arr[]) 
	{ 
		int n = arr.length; 
		int gap = n; 
		boolean swapped = true; 
		while (gap != 1 || swapped == true) 
		{ 
			gap = gapGeneration(gap); 
			swapped = false;  
			for (int i=0; i<n-gap; i++) 
			{ 
				if (arr[i] > arr[i+gap]) 
				{ 
					int temp = arr[i]; 
					arr[i] = arr[i+gap]; 
					arr[i+gap] = temp; 
					swapped = true; 
				} 
			} 
		} 
    } 

    static int gapGeneration(int gap) 
	{ 
		gap = (gap * 10) / 13; 
		if (gap < 1) 
			return 1; 
		return gap; 
	} 

	public static void main(String args[]) 
	{ 
		System.out.println("********* COMB SORT *********");
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
		combSort(arr); 
		System.out.println("Sorted array is : "+Arrays.toString(arr)); 
	} 
} 
