class Solution {

    int[] stairs;

    public int climbStairs(int n) {

        this.stairs = new int[n+1];
        Arrays.fill(this.stairs, -1);

        return recursive(n);
    }

    public int recursive(int n){
        if(n <= 2)
            this.stairs[n] = n;

        if(this.stairs[n] != -1)
            return this.stairs[n];

        this.stairs[n] = recursive(n-1) + recursive(n-2);

        return this.stairs[n];
    }
}

//n=1, n = 2