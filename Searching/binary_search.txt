// Binary Search
// https://leetcode.com/problems/binary-search/description/

class Solution {
public:
    int search(vector<int>& nums, int target) {

        int start = 0;
        int end = nums.size() - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int pivot = nums[mid];
            if (target == pivot) {
                return mid;
                break;
            } else if (target < pivot) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
};