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

        if(node == null){
            return null;
        }
        
        Map<Node, Node> visited = new HashMap<>();        
        Queue<Node> queue = new LinkedList<>();
        visited.put(node, new Node(node.val));
        queue.add(node);

        while(!queue.isEmpty()){
            Node currNode = queue.poll();
            Node newNode = visited.get(currNode);
            for(Node neighbor : currNode.neighbors){
                if(!visited.containsKey(neighbor)){
                    visited.put(neighbor, new Node(neighbor.val));
                    queue.offer(neighbor);
                }
                newNode.neighbors.add(visited.get(neighbor));
            }
        }
        return visited.get(node);
    }
}