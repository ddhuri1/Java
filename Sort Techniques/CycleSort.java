import java.util.*; 

class CycleSort
 { 
	static void cycleSort(int arr[], int n) 
	{ 
		int writes = 0; 
        for (int cycle_start = 0; cycle_start <= n - 2; cycle_start++) 
        { 
			int item = arr[cycle_start]; 
			int pos = cycle_start; 
			for (int i = cycle_start + 1; i < n; i++) 
				if (arr[i] < item) 
					pos++; 
			if (pos == cycle_start) 
				continue; 
			while (item == arr[pos]) 
				pos += 1; 
            if (pos != cycle_start) 
            { 
				int temp = item; 
				item = arr[pos]; 
				arr[pos] = temp; 
				writes++; 
			} 
            while (pos != cycle_start) 
            { 
				pos = cycle_start; 
				for (int i = cycle_start + 1; i < n; i++) 
					if (arr[i] < item) 
						pos += 1; 
				while (item == arr[pos]) 
					pos += 1; 
                if (item != arr[pos])
                { 
					int temp = item; 
					item = arr[pos]; 
					arr[pos] = temp; 
					writes++; 
				} 
			} 
		} 
	} 
	public static void main(String[] args) 
	{ 
        System.out.println("********* CYCLE SORT *********");
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr));
		cycleSort(arr, arr.length); 
		System.out.println("Sorted array is : "+Arrays.toString(arr)); 
	} 
} 