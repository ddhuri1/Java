class Solution 
{
    public int[][] highFive(int[][] items) 
    {
        if (items == null || items.length == 0 || items[0].length != 2)
            return new int[0][0];
        Arrays.sort(items, (a, b) -> (a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]));
        List<int[]> list = new ArrayList<>();
        int index=0;
        for (int i = 0; i < items.length; i++) 
        {
            if(items[i][0] != index)
            {
                list.add(new int[]{items[i][0],(items[i][1]+items[i+1][1]+items[i+2][1]+items[i+3][1]+items[i+4][1])/5});
                index=items[i][0];
                i = i+4;
            }
        }
        int[][] res = new int[list.size()][2];
        return list.toArray(res);
        
    }
}