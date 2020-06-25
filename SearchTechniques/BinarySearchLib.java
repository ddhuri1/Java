import java.util.Arrays;  

public class BinarySearchLib 
{
    public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  
        int key = 121;  
        int result = Arrays.binarySearch(arr,key);  
        if (result < 0)  
            System.out.println(key +" is not found!");  
        else  
            System.out.println(key +" is found at index: "+ result);  
    }  
}