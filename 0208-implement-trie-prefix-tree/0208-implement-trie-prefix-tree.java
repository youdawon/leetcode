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
            
            if(current.children[word.charAt(i) - 'a'] == null)
                return false;

            current = current.children[word.charAt(i) - 'a'];
        }
        
        return current.isEndOfWord;
    }
    
    public boolean startsWith(String prefix) {
        
        TrieNode current = this.root;
        
        for(int i=0; i<prefix.length(); i++){
            
            if(current.children[prefix.charAt(i) - 'a'] == null)
                return false;

            current = current.children[prefix.charAt(i) - 'a'];
        }
        
        return true;
    }
}

class TrieNode{
    
    char c;
    boolean isEndOfWord;
    TrieNode[] children = new TrieNode[26];

    TrieNode(){
        isEndOfWord = false;
    }
        
    TrieNode(char c){
        this.c = c;
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