## Dynamic Programming:

####  1. Climbing stairs :
For n stairs and k possible steps Find number of ways to climb all stairs.
Recursive Complexity: Exponential
Time complexity: O(n).

#### 2. Counting Rods : 
For a rod of size n and given the cost of selling rod at a particular length
Find the maximum profit by selling it.
Recursive Complexity: Exponential: O(2^n)
Time complexity: O(n^2)

#### 3. House Robbing : 
Given an array of houses, the robber can rob a house or will not.
If he robs a house i, he cannot rob a house i-1.
Find the maximum stolen money.
Recursive Complexity: Exponential: O(2^n)
Time complexity: O(n)

#### 4. Buy and sell Stock : 
Say you have an array for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction 
(ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
Recursive Complexity: Exponential: O(n^2)
Time complexity: O(n)

#### 5. Maximum Length of Pair Chain : 
Say you have a pair of numbers (a,b) where a < b: Find the maximum length of the chain pair
where (a,b) and (c,d), where a< b < c < d
Recursive Complexity: Exponential: O(2^n)
Time complexity: O(nlogn), since sorting is involved

#### 6. 0/1 Knapsack : 
Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. 
In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with n items respectively.
Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. 
You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).
Recursive Complexity: Exponential: O(2^n)
Time complexity: O(nW), where W can vary

#### 7. Longest Sub-Sequence: 
Time complexity: O(nm)

#### 8. Longest Sub-String: 
Time complexity: O(nm)
Traversal to find sub string is O(n), where n is length of smaller string between the two

#### 8. Longest Consecutive Sub-Sequence:
Find Longest sequence who has max length, must be consecutive
Time complexity: O(n)
