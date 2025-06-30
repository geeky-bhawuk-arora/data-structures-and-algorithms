import java.util.*;

class PositiveAND {
    static final int MOD = 1_000_000_007;

    private static int countValidArrays() {
        long[] dp = new long[MAX];
        Arrays.fill(dp, 1, MAX, 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // length of array
        int K = sc.nextInt(); // power exponent

        int MAX = 1 << (K + 1); // 2^k

        int total = countValidArrays();

        System.out.println(total);
    }
}