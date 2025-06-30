// Remove Duplicates from Sorted Array II
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length <= 2) 
            return nums.length;

        int k = 1;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }
}