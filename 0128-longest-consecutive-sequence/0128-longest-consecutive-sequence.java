class UnionFind{
    int[] parent;
    int[] size;

    public UnionFind(int n){
        this.parent = new int[n];
        this.size = new int[n];        

        for(int i=0; i<n; i++){
            this.parent[i] = i;
            this.size[i] = 1;
        }
    }

    public int find(int index){
        if(parent[index] != index)
            parent[index] = find(parent[index]);
        return parent[index];
    }

    public int union(int index1, int index2){
        int parent1 = find(index1);
        int parent2 = find(index2);

        if(parent1 != parent2){
            parent[parent2] = parent1;
            size[parent1] += size[parent2];
        }

        return this.size[parent1];
    }

}
class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;
        UnionFind uf = new UnionFind(n);        
        int maxLength = 0;
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < n; i++){
            int length = 0;
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], i);
                length = 1;
                if(hashMap.containsKey(nums[i]-1)){        
                    length = uf.union(hashMap.get(nums[i]-1), i);
                }
                if(hashMap.containsKey(nums[i]+1)){        
                    length = uf.union(i, hashMap.get(nums[i]+1));
                }            
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}