// Length of Longest Substring
// https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int m = s.length();
        int left = 0, right = 0, maxlen = 0;

        HashSet<Character> seen = new HashSet<>();

        while(right < m) {
            char c = s.charAt(right);

            while(seen.contains(c)) {
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(c);
            maxlen = Math.max(maxlen, right - left + 1);
            right++;
        }
        return maxlen;
    }
}