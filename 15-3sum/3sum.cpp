class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(),nums.end());
        vector<vector<int>> output;
        
        for (int i = 0 ; i<n;i++){
            if(i!=0 and nums[i]==nums[i-1]) continue;
            int first =nums[i];
            int start=i+1;
            int end=n-1;
            int target= -1*first;
            while(start<end){
            
            if(nums[start]+nums[end]==target){
                output.push_back({first,nums[start],nums[end]});
                start++;
                end--;
                while(start<end and nums[start]==nums[start-1]) start++;
                while(start<end and nums[end]==nums[end+1]) end--;
            }
            else if (nums[start]+nums[end]>target){
                end--;
            }
            else{
                start++;
            }
        }
        }
      return output;  
    }
};