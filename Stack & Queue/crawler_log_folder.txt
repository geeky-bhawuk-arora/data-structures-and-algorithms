// Crawler Log Folder
// https://leetcode.com/problems/crawler-log-folder/description/

#include <vector>
#include <string>
using namespace std;

class Solution {
public:
    int minOperations(vector<string>& logs) {
        int count = 0;
        for (auto& log : logs) {
            if (log == "../") {
                if (count > 0) {
                    count--;
                }
            } else if (log != "./") {
                count++;
            }
        }
        return count;
    }
};
