public class JumpSearch 
{
    public static int jumpSearch(int[] arr, int key) 
    {
        int currentRight = 0;                               // Right border of the current block
        int prevRight = 0;                                  // Right border of the previous block
        if (arr.length == 0)  return -1;
     
        if (arr[currentRight] == key) return 0;
     
        int jumpLength = (int) Math.sqrt(arr.length);     // Calculating the jump length over array elements
        while (currentRight < arr.length - 1) 
        {
            currentRight = Math.min(arr.length - 1, currentRight + jumpLength);
            if (arr[currentRight] >= key) 
                break; 
            prevRight = currentRight;
        }
     
        if ((currentRight == arr.length - 1) && key > arr[currentRight]) 
            return -1;
        return backwardLinearSearch(arr, key, prevRight, currentRight);
    }
     
    public static int backwardLinearSearch(int[] arr, int key, int leftPtr, int rightPtr)
     {
        for (int i = rightPtr; i > leftPtr; i--)
            if (arr[i] == key) 
                return i;
        return -1;
    }

    public static void main(String a[])
    {    
        int[] arr= {10,20,30,50,70,90};    
        int key = 10;    
        int result = jumpSearch(arr, key);
        if(result != -1)
            System.out.println(key +" is found at index: "+ result);  
        else
            System.out.println(key +" is not found ");
    } 
}