## Sorting Algorithms:

#### 1. Bubble Sort :
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order. <br />
Best Case Time Complexity: O(n). Best case occurs when array is already sorted.<br />
Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.<br />
Space Complexity: O(1)<br />
Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.<br />
- [x] Sorting In Place<br />
- [x] Stable

#### 2. Bucket Sort : 
Bucket sort is mainly useful when input is uniformly distributed over a range. Bucket Sort works by distributing the elements of an array into a number of buckets. Each bucket is then sorted individually, either using a different sorting algorithm, or by recursively applying the bucket sorting algorithm. <br />
Average Time Complexity: O(n + k). <br />
Worst Time Complexity: O(n²). <br />
Space complexity: O(n+k).

#### 3. Counting Sort : 
Counting sort is a sorting technique based on keys between a specific range. It works by counting the number of objects having distinct key values (kind of hashing). Then doing some arithmetic to calculate the position of each object in the output sequence. <br />
Time Complexity: O(n+k) where n is the number of elements in input array and k is the range of input. <br />
Auxiliary Space: O(n+k) <br />
**Note:** <br />
Points to be noted:
    1. Counting sort is efficient if the range of input data is not significantly greater than the number of objects to be sorted. Consider the situation where the input sequence is between range 1 to 10K and the data is 10, 5, 10K, 5K.
    2. It is not a comparison based sorting. It running time complexity is O(n) with space proportional to the range of data.
    3. It is often used as a sub-routine to another sorting algorithm like radix sort.
    4. Counting sort uses a partial hashing to count the occurrence of the data object in O(1).
    5. Counting sort can be extended to work for negative inputs also.

#### 4. Insertion Sort : 
Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.<br />
Time Complexity: O(n)<br />
Auxiliary Space: O(1)<br />
Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.<br />
Algorithmic Paradigm: Incremental Approach<br />
- [x] Sorting In Place<br />
- [x] Stable

#### 5. Merge Sort: 
Like QuickSort, Merge Sort is a Divide and Conquer algorithm. It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves. The merge() function is used for merging two halves. The merge(arr, l, m, r) is key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one.  <br />
Time Complexity: Sorting arrays on different machines. Merge Sort is a recursive algorithm and time complexity can be expressed as following recurrence relation.
T(n) = 2T(n/2) + O(n)<br />
The above recurrence can be solved either using Recurrence Tree method or Master method. It falls in case II of Master Method and solution of the recurrence is O(nLogn).<br />
Time complexity: O(nLogn) in all 3 cases (worst, average and best) as merge sort always divides the array into two halves and take linear time to merge two halves.<br />
Auxiliary Space: O(n)<br />
Algorithmic Paradigm: Divide and Conquer<br />
- [ ] Sorting In Place<br />
- [x] Stable

#### 6. Quick Sort: 
Like Merge Sort, QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways:<br />
    Always pick first element as pivot.<br />
    Always pick last element as pivot (implemented below)<br />
    Pick a random element as pivot.<br />
    Pick median as pivot.<br />
The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array as pivot, put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, and put all greater elements (greater than x) after x. All this should be done in linear time.<br />
T(n) = T(k) + T(n-k-1) + O(n)<br />
Best Time complexity: O(nLogn)<br />
Average Time complexity: O(nLogn)<br />
Worst Time complexity: O(n²).<br />
- [ ] Sorting In Place<br />
- [ ] Stable

#### 7. Radix Sort: 
We can’t use counting sort because counting sort will take O(n2) which is worse than comparison based sorting algorithms. Can we sort such an array in linear time?
Radix Sort is the answer. The idea of Radix Sort is to do digit by digit sort starting from least significant digit to most significant digit. Radix sort uses counting sort as a subroutine to sort. <br />
Time complexity:O((n+b) * logb(k)) time where b is the base for representing numbers. If k is the maximum possible value, then d would be O(logb(k))<br />

#### 8. Selection Sort:
The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.<br />
    1) The subarray which is already sorted.<br />
    2) Remaining subarray which is unsorted.<br />
In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.<br />
Time Complexity: O(n²) as there are two nested loops.<br />
Auxiliary Space: O(1)<br />
The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.<br />
- [x] Sorting In Place<br />
- [ ] Stable

#### 9. Heap Sort: 
Heap sort is a comparison based sorting technique based on Binary Heap data structure. It is similar to selection sort where we first find the maximum element and place the maximum element at the end. We repeat the same process for remaining element. Since a Binary Heap is a Complete Binary Tree, it can be easily represented as array and array based representation is space efficient. If the parent node is stored at index I, the left child can be calculated by 2 * I + 1 and right child by 2 * I + 2 (assuming the indexing starts at 0).<br />
Time complexity of heapify: O(Logn).<br />
Time complexity of createAndBuildHeap(): O(n)<br />
Total: O(nLogn).<br />
- [x] Sorting In Place<br />
- [ ] Stable

<br /><br /><br /><br />
***https://www.geeksforgeeks.org/sorting-algorithms/***
