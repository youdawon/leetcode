class Trie {
    
    Set<String> trie;
    Set<String> prefixTrie;    

    public Trie() {
        trie = new HashSet<>();        
        prefixTrie = new HashSet<>();                
    }
    
    public void insert(String word) {
        trie.add(word);
    }
    
    public boolean search(String word) {
        if(trie.contains(word))
            return true;
        
        return false;
    }
    
    public boolean startsWith(String prefix) {
        
        if(trie.contains(prefix) || prefixTrie.contains(prefix))
            return true;
        
        for(String keyword : trie){
            if(keyword.startsWith(prefix)){
                prefixTrie.add(prefix);
                return true;
            }
        }
        
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */