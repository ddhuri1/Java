
import java.util.ArrayList; 
import java.util.Collections; 

public class PairChain
{
    public static void main(String[] args)
	{
        ArrayList<Pair> pairs = new ArrayList<>();
        pairs.add(new Pair(6,7));
        pairs.add(new Pair(8,10));
        pairs.add(new Pair(1,2));
        pairs.add(new Pair(2,3));
        pairs.add(new Pair(4,5));
        
        int dist[] = new int[pairs.size() + 1];
        int pair[] = new int[pairs.size() + 1];

        Collections.sort(pairs); 

        System.out.println("Sorted Array is: " ); 
        for(Pair a : pairs)
        {
            System.out.println(a.a +","+ a.b);   
        }
         
        dist[0] = 1;
        pair[0] = 1;
        int j = 1;
        for(int i = 1; i< pairs.size(); i++)
        {
            if(pairs.get(i).a > pairs.get(i-1).b)
            {
                dist[i] = dist[i-1] + 1;
                pair[j] = i+1;
                j++;
            }
            else
            {
                dist[i] = dist[i-1];
            }

        }
        System.out.println("Maximum Pair Chain: " + dist[pairs.size() - 1]); 
        System.out.println("With Pair position at location: " );
        for(int i = 0; i<j; i++)
        {
            System.out.println(pair[i] + ", "); 
        }
        System.out.println("With Pairs:  " );

        for(int i = 0; i<j; i++)
        {
            System.out.println(pairs.get(pair[i]-1).a + ", " + pairs.get(pair[i]-1).b); 
        }

    }

    static class Pair implements Comparable<Pair>
    {
        int a, b;
        Pair(int a, int b)
        {
            this.a = a;
            this.b =  b;
        }

        @Override
        public int compareTo(Pair p) {          
            return (this.b > p.a ? 1 : -1);
                       
          } 
    }
}