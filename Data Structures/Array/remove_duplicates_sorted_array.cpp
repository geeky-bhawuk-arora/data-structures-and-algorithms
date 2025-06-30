// Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

// Two Pointer Approach
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n = nums.size();
        if (n == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 1; i < n; i++) {
            if (nums[j] != nums[i]) {
                j += 1;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
};