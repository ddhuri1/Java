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
        int arr[] = {5,4,3,2,1};
        System.out.println("Given array is : "+Arrays.toString(arr));
		cocktailSort(arr); 
		System.out.println(" Sorted array is : "+Arrays.toString(arr)); 
	} 
} 
