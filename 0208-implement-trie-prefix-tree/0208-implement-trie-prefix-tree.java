class Trie {
    
    TreeNode node;

    public Trie() {
        node = new TreeNode();
    }
    
    public void insert(String word) {        
        TreeNode current = node;
        
        for(char c : word.toCharArray()){
            if(!current.children.containsKey(c)){
                current.children.put(c, new TreeNode(c));
            } 
            current = current.children.get(c);
        }
        current.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        TreeNode current = node;
        
        for(char c : word.toCharArray()){
            if(!current.children.containsKey(c))
                return false;
            current = current.children.get(c);
        }
        if(current.isEndOfWord)
            return true;
        return false;
    }
    
    public boolean startsWith(String prefix) {
        TreeNode current = node;
        
        for(char c : prefix.toCharArray()){
            if(!current.children.containsKey(c))
                return false;
            current = current.children.get(c);
        }
        return true;        
    }
}

class TreeNode {
    
    char val;
    boolean isEndOfWord;
    HashMap<Character, TreeNode> children;
    
    TreeNode(){
        children = new HashMap<Character, TreeNode>();
        isEndOfWord = false;
    }

    TreeNode(char val){
        this.val = val;
        children = new HashMap<Character, TreeNode>();
        isEndOfWord = false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */