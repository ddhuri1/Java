import java.util.*; 

public class PigeonholeSort 
{
	static void pigeonholeSort(int arr[], int n) 
	{ 
		int min = arr[0]; 
		int max = arr[0]; 
		int range, i, j, index; 
		for(int a=0; a<n; a++) 
		{ 
			if(arr[a] > max) 
				max = arr[a]; 
			if(arr[a] < min) 
				min = arr[a]; 
		} 
		range = max - min + 1; 
		int[] phole = new int[range]; 
		Arrays.fill(phole, 0); 
		for(i = 0; i<n; i++) 
			phole[arr[i] - min]++; 
		index = 0; 
		for(j = 0; j<range; j++) 
			while(phole[j]-->0) 
				arr[index++]=j+min; 
	} 

	public static void main(String[] args) 
	{ 
		System.out.println("********* Pigeonhole SORT *********");
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
		pigeonholeSort(arr,arr.length); 
		System.out.println("Sorted array is : "+Arrays.toString(arr)); 
	} 
} 