class Node {
    char value;
    boolean isEndOfWord = false;
    Node[] next = new Node[26];

    public Node(char value){        
        this.value = value;
    }
}
class Trie {

    Node root;

    public Trie() {
        root = new Node('a');
    }
    
    public void insert(String word) {
        Node current = root;
        for(int i=0; i<word.length(); i++){
            if(current.next[word.charAt(i) - 'a'] == null){
               current.next[word.charAt(i) - 'a'] = new Node(word.charAt(i)); 
            }
            current = current.next[word.charAt(i) - 'a'];            
        }
        current.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        Node current = root;
        for(int i=0; i<word.length(); i++){
            if(current.next[word.charAt(i) - 'a'] == null) return false;
            current = current.next[word.charAt(i) - 'a'];
        }
        return current.isEndOfWord;        
    }
    
    public boolean startsWith(String prefix) {
        Node current = root;
        for(int i=0; i<prefix.length(); i++){
            if(current.next[prefix.charAt(i) - 'a'] == null) return false;
            current = current.next[prefix.charAt(i) - 'a'];
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