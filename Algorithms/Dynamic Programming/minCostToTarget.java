// You are given an array of positive integers A of size n indexed from 1 to n.You start at position 1 and want to reach position n. You can move forward using these rules: Move from position i to i+1 with a cost of 1 or, jump from position i to any position j (j > i) such that A[j] % A[i] == 0. The cost of this jump is A[i]. Your task is to find the minimum total cost to reach position n from position 1.

// Input Format
// The first line contains a single integer n (the size of the array).
// The next n lines each contain an integer A[i].

// Output Format
// Output a single integer representing the minimum cost to reach position n.

// Constraints
// 1 ≤ n ≤ 10^5
// 1 ≤ A[i] ≤ 10^9 

// DP-Approach ---> TC: O(n^2)
import java.io.*;
import java.util.*;

class minCostToTarget {

    public static long minCost(long[] A, int n) {
        long[] dp = new long[n + 1];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[1] = 0; 

        for (int i = 1; i <= n; i++) {
            if (i + 1 <= n) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
            }

            for (int j = i + 1; j <= n; j++) {
                if (A[j] % A[i] == 0) {
                    dp[j] = Math.min(dp[j], dp[i] + A[i]);
                    // A[j]++;  
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine().trim());
        long[] A = new long[n + 1];  

        for (int i = 1; i <= n; i++) {
            A[i] = Long.parseLong(br.readLine().trim());
        }

        System.out.println(minCost(A, n));
    }
}
