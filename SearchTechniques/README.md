## Searching Algorithms:

####  1. Binary Search:
When the list is sorted we can use the binary search technique to find items on the list. In this procedure, the entire list is divided into two sub-lists. If the item is found in the middle position, it returns the location, otherwise jumps to either left or right sub-list and do the same process again until finding the item or exceed the range.<br />
Time Complexity: O(1) for the best case. O(logn) for average or worst case.<br />
Space Complexity: O(1) 

#### 2. Exponential Search : 
Exponential search is also known as doubling or galloping search. This mechanism is used to find the range where the search key may present. If L and U are the upper and lower bound of the list, then L and U both are the power of 2. For the last section, the U is the last position of the list. For that reason, it is known as exponential.<br />
After finding the specific range, it uses the binary search technique to find the exact location of the search key.<br />
Time Complexity: O(1) for the best case. O(logi) for average or worst case. Where i is the location where search key is present.<br />
Space Complexity: O(1)

#### 3. Interpolation Search : 
For the binary search technique, the lists are divided into equal parts. For the interpolation searching technique, the procedure will try to locate the exact position using interpolation formula.<br /> After finding the estimated location, it can separate the list using that location. As it tries to find exact location every time, so the searching time reduces. This technique can find items easily if the items are uniformly distributed.<br />
Time Complexity: O(log(logn)) for the average case, and O(n) for the worst case (when items are distributed exponentially)<br />
Space Complexity: O(1)

#### 4. Jump Search : 
Jump search technique also works for ordered lists. It creates a block and tries to find the element in that block. If the item is not in the block, it shifts the entire block. <br />The block size is based on the size of the list. If the size of the list is n then block size will be √n. After finding a correct block it finds the item using a linear search technique. The jump search lies between linear search and binary search according to its performance.<br />
Time Complexity: O(√n)<br />
Space Complexity: O(1)

#### 5. Linear Search : 
Linear searching techniques are the simplest technique. In this technique, the items are searched one by one. This procedure is also applicable for unsorted data set. Linear search is also known as sequential search. <br />It is named as linear because its time complexity is of the order of n O(n).<br />
Time Complexity: O(n)<br />
Space Complexity: O(1)

#### 6. Ternary Search : 
Like the binary search, it also separates the lists into sub-lists. <br />This procedure divides the list into three parts using two intermediate mid values. As the lists are divided into more subdivisions, so it reduces the time to search a key value.<br />
Time Complexity: O(log<sub>3</sub>n)<br />
Space Complexity: O(1)
<br /><br /><br /><br />
***https://www.tutorialspoint.com/introduction-to-searching-algorithms***