class Node{
    char value;
    boolean isEndOfWord = false;
    Node[] next = new Node[26];

    public Node(char value){
        this.value = value;
    }
}
class WordDictionary {

    Node root;

    public WordDictionary() {
        this.root = new Node('a');
    }
    
    public void addWord(String word) {

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
        Node current = this.root;

        return search(word, current, 0);
    }

    public boolean search(String word, Node current, int index){

        if(word.length() == index){
            return current.isEndOfWord;
        }

        char c = word.charAt(index);

        if(c == '.'){
            for(Node node : current.next){
                if(node != null && search(word, node, index+1)){
                    return true;
                }
            }
            return false;
        }
        if(current.next[c - 'a'] == null){
            return false;
        }
        current = current.next[c - 'a'];

        return search(word, current, index+1);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */