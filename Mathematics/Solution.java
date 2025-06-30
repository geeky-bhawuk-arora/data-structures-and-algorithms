// Find the total number of possible integers between L and R that are NOT divisible by any integer from 2 to K.

// Input Format
// The first line contains an integer K.
// The next line contains a string L.
// The next line contains a string R.

// Constraints
// 1  ≤ 𝐾 ≤ 10^5
// 1 ≤ len(𝐿), len(𝑅) ≤ 10^5

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    static int getAns(List<Integer> primes, BigInteger L, BigInteger R) {
        int n = primes.size();
        BigInteger total = BigInteger.ZERO;         





        return ans;
    }


    static List<Integer> getPrimes(int k) {
        boolean[] isPrime = new boolean[k+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i <= k; i++) {
            if(isPrime[i]) {
                for(int j = i * i; j <= k; j++) {
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for(int i = 2; i <= k; i++) {
            if(isPrime[i]) primes.add(i);
        }
        
        return primes;
    }

    static BigInteger countDivisible(BigInteger L, BigInteger R, BigInteger d) {
        return R.divide(d).subtract(L.subtract(BigInteger.ONE).divide(d));
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine().trim());
        BigInteger l = new BigInteger(br.readLine().trim());
        BigInteger r = new BigInteger(br.readLine().trim());

        int ans = getAns(k, l, r);
        System.out.println(ans);
    }

}
