// Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right --;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left ++;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            right --;
            left ++;         
        }
        return true;
    }
}