import java.io.*;
import java.util.*;

class Solution {
    
    public static int robHouse(int arr[], int i, int[] dp) {
        if (i >= arr.length) return 0;
        if (dp[i] != -1) return dp[i];

        return dp[i] = Math.max(arr[i] + robHouse(arr, i+2, dp), robHouse(arr, i+1, dp));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int dp[] = new int[n];
        Arrays.fill(dp, -1);

        System.out.println(robHouse(arr, 0, dp));
    }
}
