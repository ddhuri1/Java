import java.util.*;
//return 3rd most freq word from given string
//Alternative approach using Trie

public class top_kth_word{
    public static void main(String [] args) {
        String s = "a b b c c c d d d d d d e e e e e f f f f";
        String[] str = s.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length; i++){
            if(map.containsKey(str[i])) // O(1)
                map.put(str[i], map.get(str[i]) + 1); //O(1)
            else
                map.put(str[i] , 1);
        }
        //O(n) n is no of words

        //PriorityQueue<String> q = new PriorityQueue<>((w1, w2) ->  (map.get(w2) - map.get(w1)));
        //O(nlogn) Quick sort in comparator
        
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE; 
        String m1 = "";
        String m2 = "";
        String m3 = "";
        for(Map.Entry<String, Integer> mapElem : map.entrySet())
        {
            //q.offer(word);
            int value  = mapElem.getValue();
            if(value > max1)
            {
                max3 = max2;
                m3 = m2;
                max2 = max1;
                m2 = m1;
                max1 = value;
                m1 = mapElem.getKey();
            }
            else if (value > max2 && value < max1)
            {
                max3 = max2;
                m3 = m2;
                max2 = value;
                m2 = mapElem.getKey();
            }
            else if(value > max3 && value < max2 && value < max1)
            {
                max3 = value;
                m3 = mapElem.getKey();
            }   

        }        
        //O(n) n is no of words; worst case all occur once

        //String r1 = q.poll();
        //String r2 = q.poll();
        //String r3 = q.poll(); 
        System.out.println("First k: " + m1 + "\nSecond k: " + m2 + "\n3rd k (ANSWER): " + m3);
    }
    //TOTAL with queue(max heap)= O(nlogn) + O(n) + O(n) => O(nlogn)
    //TOTAL without queue(max heap)=  O(n) + O(n) => O(n)
}