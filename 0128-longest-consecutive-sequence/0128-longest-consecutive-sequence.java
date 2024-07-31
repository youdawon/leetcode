class UnionFind {
    
    private int[] parent;
    private int[] size;

    public UnionFind(int n){

        this.parent = new int[n];
        this.size = new int[n];

        for(int i=0; i<n; i++){
            this.parent[i] = i;
            this.size[i] = 1;
        }
    }

    public int find(int index){
        if(index != this.parent[index]){
            return find(this.parent[index]);
        }
        return index;

    }

    public int union(int index1, int index2){
        int pIndex1 = find(index1);
        int pIndex2 = find(index2);
        
        if(pIndex1 != pIndex2){
            this.parent[pIndex2] = pIndex1;
            this.size[pIndex1] += this.size[pIndex2];
        }

        return this.size[pIndex1];
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        
        UnionFind uf = new UnionFind(nums.length);
        int maxLength = 0;
        int currLength = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
                currLength = 1;
                if(map.containsKey(nums[i]-1)){
                    currLength = uf.union(map.get(nums[i]-1), i);
                }
                if(map.containsKey(nums[i]+1)){
                    currLength = uf.union(i, map.get(nums[i]+1));
                }
                maxLength = Math.max(maxLength, currLength);
            }
        }

        return maxLength;
    }
}