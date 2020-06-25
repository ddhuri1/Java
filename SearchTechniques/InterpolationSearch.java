
public class InterpolationSearch 
{
    static public int interpolationSearch(int[] arr, int key) 
    {
        int highEnd = arr.length - 1;
        int lowEnd = 0;
     
        while (key >= arr[lowEnd] && key <= arr[highEnd] && lowEnd <= highEnd) 
        {
            int probe = lowEnd + (highEnd - lowEnd) * (key - arr[lowEnd]) / (arr[highEnd] - arr[lowEnd]);
     
            if (highEnd == lowEnd)
            {
                if (arr[lowEnd] == key) 
                    return lowEnd;
                else 
                    return -1;
            }
     
            if (arr[probe] == key) 
                return probe;     
            if (arr[probe] < key) 
                lowEnd = probe + 1;
            else 
                highEnd = probe - 1;
        }
        return -1;
    }

    public static void main(String a[])
    {    
        int[] arr= {10,20,30,50,70,90};    
        int key = 1222;    
        int result = interpolationSearch(arr, key);
        if(result != -1)
            System.out.println(key +" is found at index: "+ result);  
        else
            System.out.println(key +" is not found ");
    } 
}