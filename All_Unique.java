import java.util.HashMap; 


public class All_Unique
{
    public static void main(String[] args)
	{
        // int elem[] = {4,5,6,4,5,6,1};
        int elem[] = {1,3,3,35,2,34,5,6,5,6,1,2};
        int size = elem.length;
        int temp  = 0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); 

        //Get hashmap of all unique elements in list
        // for (int i =0; i< size; i++)
        // {
        //     hm.put(elem[i],i); 
        // }
        // System.out.print(hm.keySet()+ " ");

        for(int a : elem)
        {
            if(hm.get(a) == null)
                hm.put(a,1);
            else
                hm.put(a,hm.get(a) + 1);
        }

        System.out.print("Unique elements are: ");
        for(int a : elem)
        {
            if(hm.get(a) == 1)
            System.out.print(a + ", ");
        }

    }
}