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

        HashMap<Node, Node> map = new HashMap<Node, Node>();
        Queue<Node> queue = new LinkedList<Node>();        
        
        queue.add(node);
        map.put(node, new Node(node.val));
        
         while(!queue.isEmpty()){
             Node curNode = queue.poll();
                    
             for(Node neighbor : curNode.neighbors){
                 if(!map.containsKey(neighbor)){
                     map.put(neighbor, new Node(neighbor.val));
                     queue.add(neighbor);                     
                 }
                 map.get(curNode).neighbors.add(map.get(neighbor));
             }             
         }        
        return map.get(node);
    }
}