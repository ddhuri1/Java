import java.util.*; 

public class CocktailSort 
{ 
	static void cocktailSort(int arr[]) 
	{ 
		boolean swapped = true; 
		int start = 0; 
		int end = arr.length; 

        while (swapped == true)
        { 
			swapped = false; 
            for (int i = start; i < end - 1; ++i) 
            { 
                if (arr[i] > arr[i + 1]) 
                { 
					int temp = arr[i]; 
					arr[i] = arr[i + 1]; 
					arr[i + 1] = temp; 
					swapped = true; 
				} 
			} 			
			if (swapped == false) 
				break; 
			swapped = false; 
			end = end - 1; 
            for (int i = end - 1; i >= start; i--) 
            { 
                if (arr[i] > arr[i + 1]) 
                { 
					int temp = arr[i]; 
					arr[i] = arr[i + 1]; 
					arr[i + 1] = temp; 
					swapped = true; 
				} 
			} 
			start = start + 1; 
		} 
	} 
	public static void main(String[] args) 
	{ 
        System.out.println("********* COCKTAIL SORT *********");
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
		cocktailSort(arr); 
		System.out.println("Sorted array is : "+Arrays.toString(arr)); 
	} 
} 
