public class TernarySearchRecursive 
{
    static int ternarySearch(int left, int right, int key, int arr[]) 
    { 
        if (right >= left) 
        { 
            int mid1 = left + (right - left) / 3; 
            int mid2 = right- (right - left) / 3; 
            if (arr[mid1] == key) 
                return mid1; 
            if (arr[mid2] == key)  
                return mid2; 
            if (key < arr[mid1]) 
                return ternarySearch(left, mid1 - 1, key, arr); 
            else if (key > arr[mid2]) 
                return ternarySearch(mid2 + 1, right, key, arr); 
            else
                return ternarySearch(mid1 + 1, mid2 - 1, key, arr); 
        } 
        return -1; 
    } 
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
        int left = 0; 
        int right = 9; 
        int key = 5; 
        int result = ternarySearch(left, right, key, arr);
        if (result < 0)  
            System.out.println(key +" is not found!");  
        else  
            System.out.println(key +" is found at index: "+ result);
    } 
}