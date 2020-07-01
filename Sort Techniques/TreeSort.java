import java.util.*; 

class Node 
{ 
    int key; 
    Node left;
    Node right; 

    public Node(int item) 
    { 
        key = item; 
        left = null;
        right = null; 
    } 
} 

class TreeSort 
{ 
    TreeSort() 
	{ 
		root = null; 
    } 
	static Node root;  
	static void insert(int key) 
	{ 
		root = insertRec(root, key); 
	} 

	static Node insertRec(Node root, int key) 
	{ 
		if (root == null) 
		{ 
			root = new Node(key); 
			return root; 
		} 
		if (key < root.key) 
			root.left = insertRec(root.left, key); 
		else if (key > root.key) 
			root.right = insertRec(root.right, key); 
		return root; 
	} 
	
	static void inorderRec(Node root) 
	{ 
		if (root != null) 
		{ 
			inorderRec(root.left); 
			System.out.print(root.key + " "); 
			inorderRec(root.right); 
		} 
	} 
	static void treeins(int arr[]) 
	{ 
		for(int i = 0; i < arr.length; i++) 
		{ 
			insert(arr[i]); 
		} 
		
	} 
	public static void main(String[] args) 
	{ 
		System.out.println("********* TREE SORT *********");
        int arr[] = {2,92,14,98,32,38,66,47,42,12,11,59,49,21,87,40,84,61,97,65,18,51,30,90,25,99,91,57,27,89,67,76,78,72,56,64,37,17,9,33,73,41,82,81,54,88,100,77,80,79};
        System.out.println("Given array is : "+Arrays.toString(arr)); 
        treeins(arr); 
        System.out.print("Sorted array is : [ "); 
        inorderRec(root); 
        System.out.print("]");
	} 
} 

