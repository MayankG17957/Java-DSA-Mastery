class Solution {
    public int solve(int[] nums , int n , int i , int free ,int[][] dp ){
        if(i == n){
            return 0;
        }
        if(dp[i][free] != -1){
            return dp[i][free];
        }
        if(free == 0){
            return dp[i][free] = solve(nums , n , i+1 ,1,dp);
        }

        int c1 = nums[i] + solve(nums, n , i+1 , 0, dp);
        int c2 = solve(nums, n ,i+1 ,1 ,dp);

        return dp[i][free] = Math.max(c1,c2);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int [][] dp = new int[n][2];
        for(int[]  row : dp){
            Arrays.fill(row , -1);
        }
        return solve(nums , n , 0 , 1 ,dp);
    }
}