class Node {

    int key;
    int value;
    Node next;
    Node prev;

    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}

class LRUCache {

    int capacity;
    Map<Integer,Node> map = new HashMap<>();
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);

    public LRUCache(int capacity) {
        this.capacity = capacity;        
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (map.containsKey(key)){
            Node preNode = map.get(key);
            removeNode(preNode);
            addToHead(preNode);
            map.put(key, preNode);            
            return map.get(key).value;
        }
        
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node preNode = map.get(key);
            removeNode(preNode);
            map.remove(key);
        }

        Node newNode = new Node(key, value);
        addToHead(newNode);
        map.put(key, newNode);

        if (map.size() > this.capacity){
            Node preNode = tail.prev;
            removeNode(preNode);
            map.remove(preNode.key);
        }
    }

    public void removeNode(Node target){
        Node nextNode = target.next;
        Node prevNode = target.prev;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public void addToHead(Node newNode){
        Node temp = head.next;
        head.next = newNode;
        newNode.prev = head;
        newNode.next = temp;
        temp.prev = newNode;
    }    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */