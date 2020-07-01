import java.util.*; 

public class BogoSort 
{ 
	static void bogoSort(int[] arr) 
	{  
		while (isSorted(arr) == false) 
			shuffle(arr); 
	} 

	static void shuffle(int[] arr) 
	{ 
		for (int i = 1; i < arr.length; i++) 
			swap(arr, i, (int)(Math.random()*i)); 
	} 

	static void swap(int[] arr, int i, int j) 
	{ 
		int temp = arr[i]; 
		arr[i] = arr[j]; 
		arr[j] = temp; 
	} 

	static boolean isSorted(int[] arr) 
	{ 
		for (int i = 1; i < arr.length; i++) 
			if (arr[i] < arr[i-1]) 
				return false; 
		return true; 
	}
	public static void main(String[] args) 
	{ 
		System.out.println("********* BOGO SORT *********");
        int arr[] = {5,4,3,2,1};
        System.out.println("Given array is : "+Arrays.toString(arr));
		bogoSort(arr); 
		System.out.println("Sorted array is : "+Arrays.toString(arr));  
	} 
} 
