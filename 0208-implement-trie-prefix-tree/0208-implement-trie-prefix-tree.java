class Trie {
    
    TrieNode root;
    
    public Trie() {
        this.root = new TrieNode();
    }
    
    public void insert(String word) {
        
        TrieNode current = this.root;
        
        for(int i=0; i<word.length(); i++){
            
            if(current.children[word.charAt(i) - 'a'] == null){
                current.children[word.charAt(i) - 'a'] = new TrieNode(word.charAt(i));
            }            
            current = current.children[word.charAt(i) - 'a'];
        }
        current.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        
        TrieNode current = this.root;
        
        for(int i=0; i<word.length(); i++){
            
            TrieNode child = current.children[word.charAt(i) - 'a'];
            
            if(child == null){
                return false;
            }
            
            if(i == word.length() - 1 && child.isEndOfWord)
                return true;
            
            current = child;
        }
        
        return false;
    }
    
    public boolean startsWith(String prefix) {
        
        TrieNode current = this.root;
        
        for(int i=0; i<prefix.length(); i++){
            
            TrieNode child = current.children[prefix.charAt(i) - 'a'];
            
            if(child == null){
                return false;
            }
            
            if(i == prefix.length() - 1)
                return true;
            
            current = child;
        }
        
        return false;
    }
}

class TrieNode{
    
    char c;
    boolean isEndOfWord;
    TrieNode[] children;

    TrieNode(){
        isEndOfWord = false;
        this.children = new TrieNode[26];
    }
        
    TrieNode(char c){
        this.c = c;
        isEndOfWord = false;
        this.children = new TrieNode[26];
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */