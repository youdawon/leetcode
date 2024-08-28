class UnionFind {
    int[] parent;
    int[] size;

    public UnionFind(int[] nums){
        this.parent = new int[nums.length];
        this.size = new int[nums.length];

        for(int i=0; i < nums.length; i++){
            this.parent[i] = i;
            this.size[i] = 1;
        }
    }

    public int find(int num){
        if(this.parent[num] != num){
            this.parent[num] = find(this.parent[num]);
        }
        return this.parent[num];
    }

    public int union(int num1, int num2){
        int parent1 = find(num1);
        int parent2 = find(num2);

        if(parent1 != parent2){
            this.parent[parent2] = parent1;
            this.size[parent1] += this.size[parent2];
        }
        return size[parent1];
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {

        int maxLength = 0;
        UnionFind uf = new UnionFind(nums);

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                 int currLength = 0;               
                map.put(nums[i], i);
                currLength = uf.size[i];
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