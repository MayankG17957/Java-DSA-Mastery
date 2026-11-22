
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        // Case 1: Exclude the last house
        int case1 = solve(nums, 0, n - 2);

        // Case 2: Exclude the first house
        int case2 = solve(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    public int solve(int[] nums, int start, int end) {

        int n = end - start + 1;

        int[] dp = new int[n];

        // Base cases
        dp[0] = nums[start];

        if (n > 1) {
            dp[1] = Math.max(nums[start], nums[start + 1]);
        }

        // Tabulation
        for (int i = 2; i < n; i++) {

            int pick = nums[start + i] + dp[i - 2];
            int notPick = dp[i - 1];

            dp[i] = Math.max(pick, notPick);
        }

        return dp[n - 1];
    }
}
