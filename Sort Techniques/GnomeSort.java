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
        int arr[] = {5,4,3,2,1};
        System.out.println("Given array is : "+Arrays.toString(arr));
		gnomeSort(arr, arr.length); 
		System.out.println("Sorted array is : "+Arrays.toString(arr)); 
	} 
} 
