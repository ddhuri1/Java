class Codec 
{

    class WrappableInt
    {
        private Integer value;
        public WrappableInt(Integer x) 
        {
            value = x;
        }
        public Integer getValue()
        {
            return value;
        }
        public void increment()
        {
            value ++;
        }
    }
    // Encodes a tree to a single string.
    public String serialize(Node root) 
    {
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        return sb.toString();
    }
    private void dfs(Node root, StringBuilder sb) 
    {
        if(root == null) return;
        sb.append((char)(root.val + '0'));
        for(Node child : root.children)
            dfs(child, sb);
        sb.append('#');
    }

    // Decodes your encoded data to tree.
    public Node deserialize(String data)
    {
        if(data.isEmpty())
            return null;
        return ds(data, new WrappableInt(0)); 
    }
    private Node ds(String data, WrappableInt index) 
    {
        if(index.getValue() == data.length()) return null;
        Node node = new Node(data.charAt(index.getValue()) - '0', new ArrayList<Node>());
        index.increment();
        while(data.charAt(index.getValue()) != '#') 
            node.children.add(ds(data, index));
        index.increment();
        return node;
    }
}
// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));