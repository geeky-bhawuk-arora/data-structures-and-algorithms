// Left Rotate an Array by One
// https://www.naukri.com/code360/problems/left-rotate-an-array-by-one_5026278

class Solution {
    static int[] rotateArray(int[] arr, int n) {
        int temp = arr[0]; 
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp; 
        return arr;
    }
}

// TC - O(n)
// SC - O(n) and O(1) Extra space is used