// Introduction to DP
// https://www.geeksforgeeks.org/problems/introduction-to-dp/1

class Solution {
    static final int MOD = 1000000007;

    // Top-Down Approach with Memoization (using dp array)
    // TC -> O(n), SC -> O(n) + O(n)
    static long topDown(int n) {
        long[] dp = new long[n + 1];
        Arrays.fill(dp, -1);
        return topDown(n, dp);
    }

    static long topDown(int n, long[] dp) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (dp[n] != -1) return dp[n]; 
        return dp[n] = (topDown(n-1, dp) + topDown(n-2, dp)) % MOD;
    }

    // Bottom-Up Approach
    // TC -> O(n), SC -> O(n)
    static long bottomUp(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
        return dp[n];
    }
}