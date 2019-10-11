import java.util.Arrays;

public class Robbing
{
    public static void main(String[] args)
	{
        // int nums[] = {1,2,3,4,5};
        int nums[] = {10,12,16,13,3,26,7};
        int[] rob = new int[nums.length + 1];
        int n = nums.length;
        rob[0]=nums[0];
        int taken[] = new int[nums.length + 1];
        Arrays.fill(taken,0);
        // System.out.println(rob[0]);
        rob[1]=Math.max(nums[0],nums[1]);
        // System.out.println(rob[1]);
        for(int i=2; i<n; i++ )
        {
            // rob[i] = Math.max(rob[i-1] , nums[i]+rob[i-2]);
            if(rob[i-1] > nums[i]+rob[i-2])
            {
                rob[i] = rob[i-1];
                if(taken[i-2] != 1)
                    taken[i-1] = 1;
            }
            else
            {
                rob[i] = nums[i]+rob[i-2];
                try
                {
                    if(taken[i-3] != 1)
                    {
                        taken[i-2] = 1;
                        if(i == n-1)
                            taken[i] = 1;
                    }
                }
                catch(IndexOutOfBoundsException ie)
                {
                    taken[i-2] = 1;
                    if(i == n-1)
                        taken[i] = 1;
                }
            }
            // System.out.println(rob[i]);
        }
        // System.out.println(rob[n-1]);
        System.out.println("Houses taken are: ");
        for(int i=0; i<n; i++ )
        {
            
            if(taken[i] == 1)
                System.out.println( (i+1) + " With cash: " + nums[i]);
        }
        System.out.println("Total stolen money is: " + rob[n-1]);
    }
}

