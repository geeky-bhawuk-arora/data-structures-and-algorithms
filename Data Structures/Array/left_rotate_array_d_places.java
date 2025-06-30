// Left Rotate an Array by d Places
// https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1


// Brute Force Approach 
class Solution {
    static void rotateArr(int arr[], int d, int n) {
        if (n == 0)
            return;

        d = d % n;
        if (d == 0)
            return;

        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        for (int i = n - d; i < n; i++) { // O(d)
            arr[i] = temp[i - (n - d)];
        }
    }
}
// TC - O(d) + O(n-d) + O(d) = O(n+d) 
// SC - O(d)



// Optimal Approach
class SolutionFile {
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    static void rotateArr(int arr[], int d, int n) {
        if (n == 0 || d == 0 || d % n == 0) 
            return;

        d = d % n; 

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }
}
// TC - O(n)
// SC - O(1)