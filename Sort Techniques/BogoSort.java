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
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
		bogoSort(arr); 
		System.out.println("Sorted array is : "+Arrays.toString(arr));  
	} 
} 
