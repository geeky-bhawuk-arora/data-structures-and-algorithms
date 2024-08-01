// Average Waiting Time
// https://leetcode.com/problems/average-waiting-time/

class Solution {
    public double averageWaitingTime(int[][] customers) {
        double totalWaitTime = 0;
        int currTime = 0;

        for (int i = 0; i < customers.length; i++) {
            int arrivalTime = customers[i][0];
            int cookTime = customers[i][1];

            if (currTime < arrivalTime) {
                currTime = arrivalTime;
            }

            int waitTime = currTime + cookTime - arrivalTime;
            totalWaitTime += waitTime;
            currTime += cookTime;
        }

        return totalWaitTime / customers.length;
    }
}
