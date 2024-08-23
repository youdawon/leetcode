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
        
        Map<Node, Node> nodeMap = new HashMap<>();        
        Queue<Node> q = new LinkedList<>();
        nodeMap.put(node, new Node(node.val));
        q.add(node);

        while(!q.isEmpty()){
            Node currNode = q.poll();
            Node newNode = nodeMap.get(currNode);
            for(Node neighbor : currNode.neighbors){
                if(!nodeMap.containsKey(neighbor)){
                    nodeMap.put(neighbor, new Node(neighbor.val));
                    q.offer(neighbor);
                }
                newNode.neighbors.add(nodeMap.get(neighbor));
            }
            nodeMap.put(currNode, newNode);            
        }
        return nodeMap.get(node);
    }
}