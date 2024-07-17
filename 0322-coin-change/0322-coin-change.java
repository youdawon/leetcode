class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] arr = new int[amount+1];
        Arrays.fill(arr, amount+1);
        arr[0] = 0;

        for(int i=1; i<amount+1; i++){
            for(int coin : coins){
                if (coin > i) continue;

                arr[i] = Math.min(arr[i], arr[i-coin] + 1);
            }
        }
        
        return arr[arr.length-1] == amount+1 ? -1 : arr[arr.length-1];
    }
}