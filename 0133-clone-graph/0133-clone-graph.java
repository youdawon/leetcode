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

        HashMap<Integer, Node> map = new HashMap<Integer, Node>();
        Queue<Node> queue = new LinkedList<Node>();        
        Node newNode = new Node(node.val);
        
        queue.add(node);
        map.put(node.val, newNode);
        
         while(!queue.isEmpty()){
             Node curNode = queue.poll();
                    
             for(Node neighbor : curNode.neighbors){
                 if(!map.containsKey(neighbor.val)){
                     map.put(neighbor.val, new Node(neighbor.val));
                     queue.add(neighbor);                     
                 }
                 map.get(curNode.val).neighbors.add(map.get(neighbor.val));
             }             
         }        
        return newNode;
    }
}