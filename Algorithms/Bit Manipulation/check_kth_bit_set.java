// K-th Bit is Set or Not
// https://www.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1

class CheckBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        // Shift 1 left by k positions and perform bitwise AND with n
        // If result is non-zero, the Kth bit is set
        return (n & (1 << k)) != 0;
    }
}
