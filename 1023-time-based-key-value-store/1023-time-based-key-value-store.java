class TreeNode {

    int timestamp;
    String value;

    TreeNode(String value, int timestamp){
        this.value = value;
        this.timestamp = timestamp;
    }

}
class TimeMap {

    HashMap<String, List<TreeNode>> map;

    public TimeMap() {
        this.map = new HashMap<String, List<TreeNode>>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!this.map.containsKey(key)){            
            this.map.put(key, new ArrayList());
        } 
        this.map.get(key).add(new TreeNode(value, timestamp));
    }
    
    public String get(String key, int timestamp) {

        if(!this.map.containsKey(key)) return "";

        List<TreeNode> list = this.map.get(key);

        String res = "";
        int left = 0;
        int right = list.size()-1;        

        while(left <= right){
            int mid = left + (right-left) / 2;

            if (list.get(mid).timestamp <= timestamp){
                res = list.get(mid).value;
                left = mid+1;
            } else {
                right = mid-1;
            }
        }

        return res;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */