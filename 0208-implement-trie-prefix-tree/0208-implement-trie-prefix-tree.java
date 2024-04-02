class Trie {
    
    TrieNode root;
    
    public Trie() {
        this.root = new TrieNode();
    }
    
    public void insert(String word) {
        
        TrieNode current = this.root;
        
        for(int i=0; i<word.length(); i++){

            TrieNode child = new TrieNode();
            
            if(!current.children.containsKey(word.charAt(i))){
                child = new TrieNode(word.charAt(i));                
                current.children.put(word.charAt(i), child);
            } else {
                child = current.children.get(word.charAt(i)); 
            }   
            
            if(i == word.length()-1)
                child.isEndOfWord = true;
            
            current = child;
        }
    }
    
    public boolean search(String word) {
        
        TrieNode current = this.root;

        for(int i=0; i<word.length(); i++){            
            if(!current.children.containsKey(word.charAt(i)))
                return false;
            
            current = current.children.get(word.charAt(i));  
            

                            
            if(i == word.length() - 1 && current.isEndOfWord)
                return true;
        }
        
        return false;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode current = this.root;

        for(int i=0; i<prefix.length(); i++){
            if(!current.children.containsKey(prefix.charAt(i)))
                return false;
            
            current = current.children.get(prefix.charAt(i));            
                            
            if(i == prefix.length() - 1)
                return true;
        }
        
        return false;
    }
}

class TrieNode{
    
    char c;
    boolean isEndOfWord;
    HashMap<Character, TrieNode> children;

    TrieNode(){
        isEndOfWord = false;
        this.children = new HashMap<Character, TrieNode>();
    }
        
    TrieNode(char c){
        this.c = c;
        isEndOfWord = false;
        this.children = new HashMap<Character, TrieNode>();        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */