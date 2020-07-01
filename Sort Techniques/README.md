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

#### 10. Shell Sort: 
ShellSort is mainly a variation of Insertion Sort. In insertion sort, we move elements only one position ahead. When an element has to be moved far ahead, many movements are involved. The idea of shellSort is to allow exchange of far items. In shellSort, we make the array h-sorted for a large value of h. We keep reducing the value of h until it becomes 1. An array is said to be h-sorted if all sublists of every h’th element is sorted.<br />
Time complexity of heapif: O(n<sup>2</sup>).<br />
- [ ] Sorting In Place<br />
- [ ] Stable

#### 11. Cycle Sort: 
Cycle sort is an in-place sorting Algorithm, unstable sorting algorithm, a comparison sort that is theoretically optimal in terms of the total number of writes to the original array.
It is optimal in terms of number of memory writes. It minimizes the number of memory writes to sort (Each value is either written zero times, if it’s already in its correct position, or written one time to its correct position.)
It is based on the idea that array to be sorted can be divided into cycles. Cycles can be visualized as a graph. We have n nodes and an edge directed from node i to node j if the element at i-th index must be present at j-th index in the sorted array.<br />
Time Complexity : O(n²)<br />
Worst Case : O(n²)<br />
Average Case: O(n²)<br />
Best Case : O(n²)<br />

#### 12. Comb Sort: 
Comb Sort is mainly an improvement over Bubble Sort. Bubble sort always compares adjacent values. So all inversions are removed one by one. Comb Sort improves on Bubble Sort by using gap of size more than 1. The gap starts with a large value and shrinks by a factor of 1.3 in every iteration until it reaches the value 1. Thus Comb Sort removes more than one inversion counts with one swap and performs better than Bubble Sort.<br />
The shrink factor has been empirically found to be 1.3 (by testing Combsort on over 200,000 random lists).<br />
Time Complexity : Worst case complexity is O(n²) <br /> 
Best Case complexity is O(n).<br />
Auxiliary Space : O(1).

#### 13. Pigeonhole Sort: 
Pigeonhole sorting is a sorting algorithm that is suitable for sorting lists of elements where the number of elements and the number of possible key values are approximately the same.
It requires O(n + Range) time where n is number of elements in input array and ‘Range’ is number of possible values in array.<br />

#### 14. Cocktail Sort: 
Cocktail Sort is a variation of Bubble sort. The Bubble sort algorithm always traverses elements from left and moves the largest element to its correct position in first iteration and second largest in second iteration and so on. Cocktail Sort traverses through a given array in both directions alternatively.<br />
Worst and Average Case Time Complexity: O(n*n).<br />
Auxiliary Space: O(1)<br />
- [x] Sorting In Place<br />
- [x] Stable

#### 15. Odd-Even Sort: 
This is basically a variation of bubble-sort. This algorithm is divided into two phases- Odd and Even Phase. The algorithm runs until the array elements are sorted and in each iteration two phases occurs- Odd and Even Phases.
In the odd phase, we perform a bubble sort on odd indexed elements and in the even phase, we perform a bubble sort on even indexed elements.<br />
Time Complexity : O(n²) where, n = Number of elements in the input array.<br />
Auxiliary Space : O(1). Just like bubble sort this is also an in-place algorithm.

#### 16. Tim Sort: 
TimSort is a sorting algorithm based on Insertion Sort and Merge Sort.
A stable sorting algorithm works in O(n Log n) time
Used in Java’s Arrays.sort() as well as Python’s sorted() and sort().<br />
First sort small pieces using Insertion Sort, then merges the pieces using merge of merge sort.<br />
We divide the Array into blocks known as Run. We sort those runs using insertion sort one by one and then merge those runs using combine function used in merge sort. If the size of Array is less than run, then Array get sorted just by using Insertion Sort. The size of run may vary from 32 to 64 depending upon the size of the array. Note that merge function performs well when sizes subarrays are powers of 2. The idea is based on the fact that insertion sort performs well for small arrays.<br />
Details of implementation :<br />
- [x] We consider size of run as 32.
- [x] We one by one sort pieces of size equal to run
- [x] After sorting individual pieces, we merge them one by one. We double the size of merged subarrays after every iteration.<br />

#### 17. Gonme Sort: 
Gnome Sort also called Stupid sort is based on the concept of a Garden Gnome sorting his flower pots. <br />
A garden gnome sorts the flower pots by the following method-<br />
He looks at the flower pot next to him and the previous one; if they are in the right order he steps one pot forward, otherwise he swaps them and steps one pot backwards.<br />
If there is no previous pot (he is at the starting of the pot line), he steps forwards; if there is no pot next to him (he is at the end of the pot line), he is done.<br />
Time Complexity – As there are no nested loop (only one while) it may seem that this is a linear O(N) time algorithm. But the time complexity is O(n²). This is because the variable – ‘index’ in our program doesn’t always gets incremented, it gets decremented too.<br />
However this sorting algorithm is adaptive and performs better if the array is already/partially sorted.<br />
Auxiliary Space –  This is an in-place algorithm. So O(1) auxiliary space is needed.

#### 18. Bitonic Sort: 
Bitonic Sort is a classic parallel algorithm for sorting.

Bitonic sort does O(nlog<sup>2</sup>n) comparisons.<br />
The number of comparisons done by Bitonic sort are more than popular sorting algorithms like Merge Sort [ does O(nLogn) comparisons], but Bitonice sort is better for parallel implementation because we always compare elements in predefined sequence and the sequence of comparison doesn’t depend on data. Therefore it is suitable for implementation in hardware and parallel processor array.<br />
Bitonic Sort must be done if number of elements to sort are 2^n. The procedure of bitonic sequence fails if the number of elements are not in aforementioned quantity precisely.<br />
Time Complexity :O(nlog<sup>2</sup>n). 

#### 19. Pancake Sort: 
Given an unsorted array, sort the given array. You are allowed to do only following operation on array.
flip(arr, i): Reverse array from 0 to i <br />
Unlike a traditional sorting algorithm, which attempts to sort with the fewest comparisons possible, the goal is to sort the sequence in as few reversals as possible.
The idea is to do something similar to Selection Sort. We one by one place maximum element at the end and reduce the size of current array by one.<br />
Time Complexity :O(n<sup>2</sup>).

#### 20. Bogo Sort: 
BogoSort also known as permutation sort, stupid sort, slow sort, shotgun sort or monkey sort is a particularly ineffective algorithm based on generate and test paradigm. The algorithm successively generates permutations of its input until it finds one that is sorted.<br />
Time Complexity:<br />
Worst Case : O(∞) (since this algorithm has no upper bound)<br />
Average Case: O(n*n!)<br />
Best Case : O(n)(when array given is already sorted)<br />
Auxiliary Space : O(1)

#### 21. Stooge Sort: 
The Stooge sort is a recursive sorting algorithm. Always take the ceil of ((2/3)*N) for selecting elements.<br />
The running time complexity of stooge sort can be written as, T(n) = 3T(3n/2) + T(1)
Solution of above recurrence is O(n<sup>(log3/log1.5)</sup>) = O(n<sup>2.709</sup>), hence it is slower than even bubble sort(n<sup>2</sup>).

#### 22. Tree Sort: 
Tree sort is a sorting algorithm that is based on Binary Search Tree data structure. It first creates a binary search tree from the elements of the input list or array and then performs an in-order traversal on the created binary search tree to get the elements in sorted order.<br />
Average Case Time Complexity : O(nlogn)
Adding one item to a Binary Search tree on average takes O(log n) time. Therefore, adding n items will take O(n log n) time<br />
Worst Case Time Complexity : O(n<sup>2</sup>). The worst case time complexity of Tree Sort can be improved by using a self-balancing binary search tree like Red Black Tree, AVL Tree. Using self-balancing binary tree Tree Sort will take O(nlogn) time to sort the array in worst case.<br />
Auxiliary Space : O(n)


<br /><br /><br /><br />
***https://www.geeksforgeeks.org/sorting-algorithms/***
