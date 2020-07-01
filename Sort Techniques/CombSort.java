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
        int arr[] = {5,4,3,2,1};
        System.out.println("Given array is : "+Arrays.toString(arr));
		combSort(arr); 
		System.out.println(" Sorted array is : "+Arrays.toString(arr)); 
	} 
} 
