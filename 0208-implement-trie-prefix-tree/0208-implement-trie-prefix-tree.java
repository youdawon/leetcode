class Trie {
    
    TreeNode node;

    public Trie() {
        node = new TreeNode();
    }
    
    public void insert(String word) {        
        TreeNode current = node;
        
        for(char c : word.toCharArray()){            
            if(current.children[c-'a'] == null)
                current.children[c-'a'] = new TreeNode(c);
            current = current.children[c-'a'];
        }
        current.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        TreeNode current = node;
        
        for(char c : word.toCharArray()){
            if(current.children[c-'a'] == null)
                return false;
            current = current.children[c-'a'];
        }
        if(current.isEndOfWord)
            return true;
        return false;
    }
    
    public boolean startsWith(String prefix) {
        TreeNode current = node;
        
        for(char c : prefix.toCharArray()){
            if(current.children[c-'a'] == null)
                return false;
            current = current.children[c-'a'];
        }
        return true;        
    }
}

class TreeNode {
    
    char val;
    boolean isEndOfWord;
    TreeNode[] children;
    
    TreeNode(){
        children = new TreeNode[26];        
        isEndOfWord = false;
    }

    TreeNode(char val){
        this.val = val;
        children = new TreeNode[26];        
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