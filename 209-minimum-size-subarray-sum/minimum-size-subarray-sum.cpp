class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int i = 0; 
        int j = 0 ;
        int sum = 0 ;
        int res = INT_MAX;
        while(j<nums.size())
        {
            sum=sum+nums[j];
            while(sum>=target)
            {
                int length = j-i+1;
                res = min(res,length);
                sum= sum-nums[i];
                i++;
            }
            j++;
        }
         if (res == INT_MAX) return 0;
        
          return res;
    }
};