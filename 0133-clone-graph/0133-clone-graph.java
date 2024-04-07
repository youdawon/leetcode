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
    
        HashMap<Integer, Node> map = new HashMap<>();        
        Queue<Node> q = new LinkedList<Node>();
        
        Node newNode = new Node(node.val);
        
        if(node.neighbors.size() == 0)
            return newNode;
        
        q.offer(node);
        map.put(node.val, newNode);
        
        while(!q.isEmpty()){
            
            Node current = q.poll();
            
            for(Node neighbor : current.neighbors){
                if(!map.containsKey(neighbor.val)){
                    map.put(neighbor.val, new Node(neighbor.val));
                    q.offer(neighbor);
                }
                map.get(current.val).neighbors.add(map.get(neighbor.val));                
            }
        }            
        
        return newNode;
    }
}