// Pass the Pillow
// https://leetcode.com/problems/pass-the-pillow/

class Solution {
    public int passThePillow(int n, int time) {
        int cycleLength = (n - 1) * 2; 
        time = time % cycleLength; 

        if (time < n) 
            return 1 + time; 
        return n - (time - (n - 1)); 
    }
}

