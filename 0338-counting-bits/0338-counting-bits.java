class Solution {
    public int[] countBits(int n) {

        int[] countArr = new int[n+1];

        for(int i=0; i<=n; i++){
            int num = i;
            while(num != 0){
                if((num & 1) == 1){
                    countArr[i]++;
                }
                num = num >> 1;
            }
        }

        return countArr;
    }
}