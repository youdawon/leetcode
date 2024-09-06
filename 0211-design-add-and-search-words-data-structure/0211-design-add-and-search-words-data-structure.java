class Node {

    public char c;
    public Node[] next;
    public boolean isEndOfWord;

    public Node(){
        this.next = new Node[26];
        this.isEndOfWord = false;
    }    

    public Node(char c){
        this.c = c;
        this.next = new Node[26];
        this.isEndOfWord = false;
    }    
}
class WordDictionary {

    private Node root;

    public WordDictionary() {
        this.root = new Node();        
    }
    
    public void addWord(String word) {

        Node current = this.root;

        for(char c : word.toCharArray()){
            if(current.next[c - 'a'] == null){
                current.next[c - 'a'] = new Node(c);
            }
            current = current.next[c - 'a'];
        }
        current.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    public boolean dfs(String word, int index, Node current) {

        if(index == word.length()){
            return current.isEndOfWord;
        }

        char c = word.charAt(index);
        
        if(c == '.'){
            for(Node nextNode : current.next){
                if(nextNode != null && dfs(word, index+1, nextNode)){
                    return true;
                }
            }
            return false;
        } else {
            if(current.next[c - 'a'] == null){
                return false;
            }
            current = current.next[c - 'a'];
         }

        return dfs(word, index+1, current); 
    }    
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */