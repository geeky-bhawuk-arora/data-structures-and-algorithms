// Bob has an array S of size N.
// Each element S[i] has a probability P[i]% of going into array A, and (100 - P[i])% of going into B.

// After splitting, Bob evaluates the score for each resulting array.

// For an array X of size M, the score increases by 1 for each i such that
// X[i] < X[i+1] (for 1 <= i < M).

// You must find the expected number of score points from both arrays A and B, after splitting.

// Return the answer as a fraction p/q, and compute the result as:

// result = p * q^{-1} mod(10^9 + 7)
// (where q^{-1} is the modular inverse of q).

import java.io.*;


public class randomArraySplitter {

        static final int MOD = 1_000_000_007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] S = new int[N];
        int[] P = new int[N];

        String[] sStr = br.readLine().split(" ");
        String[] pStr = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            S[i] = Integer.parseInt(sStr[i]);
            P[i] = Integer.parseInt(pStr[i]);
        }

        long numerator = 0;
        long denominator = 1;

        for (int i = 0; i < N - 1; i++) {
            if (S[i] < S[i + 1]) {
                long probSameArray = (1L * P[i] * P[i + 1] + 1L * (100 - P[i]) * (100 - P[i + 1])) % MOD;
                numerator = (numerator + probSameArray) % MOD;
            }
        }
    }
}