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

    Map<Integer, Node> map = new HashMap<>(); 

    public Node cloneGraph(Node node) {
        if (node == null) {
            return node;
        }
        if (map.containsKey(node.val)) {
            return map.get(node.val);
        }
        Node copy = new Node(node.val);
        map.put(node.val, copy);
        List<Node> neighbours = new ArrayList<Node>();
        for(Node neighbour: node.neighbors) {
            neighbours.add(cloneGraph(neighbour));
        }
        copy.neighbors = neighbours;
        return copy;
    }
}