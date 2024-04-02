class Trie {
    
    Set<String> trie;
    HashMap<Character, HashSet<String>> prefixTrie;

    public Trie() {
        trie = new HashSet<>();        
        prefixTrie = new HashMap<Character, HashSet<String>>();                
    }
    
    public void insert(String word) {
        trie.add(word);
        
        HashSet<String> prefixKeywords = new HashSet<String>();        
        
        if(prefixTrie.containsKey(word.charAt(0))){
            prefixKeywords = prefixTrie.get(word.charAt(0));
        }
        
        prefixKeywords.add(word);
        
        prefixTrie.put(word.charAt(0), prefixKeywords);
    }
    
    public boolean search(String word) {
        if(trie.contains(word))
            return true;
        
        return false;
    }
    
    public boolean startsWith(String prefix) {
        
        if(trie.contains(prefix))
            return true;
        
        
        if(prefixTrie.containsKey(prefix.charAt(0)) && prefixTrie.get(prefix.charAt(0)).contains(prefix))
            return true;
        
        for(String keyword : trie){
            if(keyword.startsWith(prefix)){
                prefixTrie.get(prefix.charAt(0)).add(prefix);
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