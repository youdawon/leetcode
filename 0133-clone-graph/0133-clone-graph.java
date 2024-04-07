/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    public Node cloneGraph(Node node) {
        
        if(node == null)
            return null;
        
        Queue<Node> visited = new LinkedList<>();
        HashMap<Node, Node> map = new HashMap<Node, Node>();           
        
        Node n = new Node(node.val);

        if(node.neighbors.size() == 0)
            return n;
        
        visited.offer(node);
        map.put(node, n);
        
        while(!visited.isEmpty()){
            
            Node current = visited.poll();           
            
            for(Node neighbor : current.neighbors){
                if(!map.containsKey(neighbor)){
                    map.put(neighbor, new Node(neighbor.val));
                    visited.offer(neighbor);
                }
                map.get(current).neighbors.add(map.get(neighbor));                
            }
        }
        
        return map.get(node);
    }    
}