// You need to count strings of length N made up of letters 'A', 'B', 'C'. But strings containing "ABC" as a substring are not allowed. Output the result modulo 10^9 + 7

import java.io.*;

public class countStringsWithoutABC {
    static final int MOD = 1_000_000_007;
 


    static int countStrings(int n) {
        
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        System.out.println(countStrings(n));
    }
}