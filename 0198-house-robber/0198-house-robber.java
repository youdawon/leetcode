class Solution {
    public int rob(int[] nums) {

        int n = nums.length;
        int[] robbedMoney = new int[nums.length];
        robbedMoney[0] = nums[0];

        for(int i=1; i<n; i++){
            if(i<2){
                robbedMoney[i] = Math.max(robbedMoney[i-1], nums[i]);                
            }else{
                robbedMoney[i] = Math.max(robbedMoney[i-1], robbedMoney[i-2]+nums[i]);
            }
        }

        return robbedMoney[n-1];
    }
}

//nums = [2,7,9,3,1]
/**
 2,7,11,10,12
 */