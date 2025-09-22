class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int> mpp;  
        mpp[0] = 1;   // base case: subarray starting from index 0

        int preSum = 0, cnt = 0;

        for (int i=0; i<nums.size(); i++) {
            preSum += nums[i];                  // update prefix sum
            int remove = preSum - k;           // find target prefix
            cnt += mpp[remove];                // add how many subarrays
            mpp[preSum]++;                  // record this prefix sum
        }
    return cnt;
    }
};