class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int low = 0 ;
        int high= 1;
        int count = 1;

       while(high<nums.size()){
            if(nums[high]==nums[low]){
                high++;
                continue;
            }
            else {
                nums[low+1]=nums[high];
                low++;
                high++;
                count++;
            }
        }
        return count;

        
    }
};