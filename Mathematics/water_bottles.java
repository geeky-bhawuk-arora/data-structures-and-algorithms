// Water Bottles 
// https://leetcode.com/problems/water-bottles/description/

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;
        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            totalBottles += newBottles;
            numBottles = newBottles + (numBottles % numExchange);
        }
        return totalBottles;
    }
}

-------------------------------------------------------------------------

// Water Bottles II
// https://leetcode.com/problems/water-bottles-ii/