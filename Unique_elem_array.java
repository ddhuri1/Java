public class Unique_elem_array
{
    public static void main(String[] args)
	{
        // int elem[] = {4,5,6,4,5,6,1};
        int elem[] = {1,3,3,2,34,5,6,5,6,1,2};
        int size = elem.length;
        int temp  = 0;

        for (int i =0; i< size; i++)
        {
            //X-OR the elements as similar elements when exored give 0, but unique give the number itself
            //eg: 0 ^ 0= 0 and 1 ^ 1 = 0, but 0 ^ 1 = 1 
            temp = temp ^ elem[i];
        }
        System.out.println("The Unique elem is: " + temp);
    }
}