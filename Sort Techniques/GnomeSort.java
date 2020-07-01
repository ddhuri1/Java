import java.util.Arrays; 

public class GnomeSort
{ 
	static void gnomeSort(int[] arr, int n) 
	{ 
		int index = 0; 
        while (index < n)
         { 
			if (index == 0) 
				index++; 
			if (arr[index] >= arr[index - 1]) 
				index++; 
            else 
            { 
				int temp = 0; 
				temp = arr[index]; 
				arr[index] = arr[index - 1]; 
				arr[index - 1] = temp; 
				index--; 
			} 
		} 
		return; 
	} 
	public static void main(String[] args) 
	{ 
		System.out.println("********* GNOME SORT *********");
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
		gnomeSort(arr, arr.length); 
		System.out.println("Sorted array is : "+Arrays.toString(arr)); 
	} 
} 
