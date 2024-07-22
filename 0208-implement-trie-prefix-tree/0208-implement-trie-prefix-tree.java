class TreeNode {
    char value;
    boolean isEndOfWord = false;
    Map<Character, TreeNode> nextNodes;

    public TreeNode(){

        nextNodes = new HashMap<Character, TreeNode>();
    }


    public TreeNode(char value){
        this.value = value;
        nextNodes = new HashMap<Character, TreeNode>();
    }    
}

class Trie {

    TreeNode head;

    public Trie() {
        this.head = new TreeNode();
    }
    
    public void insert(String word) {

        TreeNode current = this.head;

        for (char c : word.toCharArray()){
            if(!current.nextNodes.containsKey(c)){
                current.nextNodes.put(c, new TreeNode(c));
            }
            current = current.nextNodes.get(c);
        }
        current.isEndOfWord = true;
    }
    
    public boolean search(String word) {

        TreeNode current = this.head;

        for (char c : word.toCharArray()){
            if(!current.nextNodes.containsKey(c)) return false;
            current = current.nextNodes.get(c);
        }
        return current.isEndOfWord;    
    }
    
    public boolean startsWith(String prefix) {
        TreeNode current = this.head;

        for (char c : prefix.toCharArray()){
            if(!current.nextNodes.containsKey(c)) return false;
            current = current.nextNodes.get(c);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */