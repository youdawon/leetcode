class TreeNode {
    
    char value;
    boolean isEndOfWord = false;
    TreeNode[] nextNodes = new TreeNode[26];

    public TreeNode(){
    }


    public TreeNode(char value){
        this.value = value;
    }    
}

class Trie {

    TreeNode head;

    public Trie() {
        this.head = new TreeNode();
    }
    
    public void insert(String word) {

        TreeNode current = this.head;

        for(int i=0; i<word.length(); i++){
            if(current.nextNodes[word.charAt(i) - 'a'] == null){
                current.nextNodes[word.charAt(i) - 'a'] = new TreeNode(word.charAt(i));
            }
            current = current.nextNodes[word.charAt(i) - 'a'];
        }
        current.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        TreeNode current = this.head;

        for(int i=0; i<word.length(); i++){
            if(current.nextNodes[word.charAt(i) - 'a'] == null) return false;
            current = current.nextNodes[word.charAt(i) - 'a'];
        }
        return current.isEndOfWord;
    }
    
    public boolean startsWith(String prefix) {
        TreeNode current = this.head;

        for(int i=0; i<prefix.length(); i++){
            if(current.nextNodes[prefix.charAt(i) - 'a'] == null) return false;
            current = current.nextNodes[prefix.charAt(i) - 'a'];
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