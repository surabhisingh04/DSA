class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int el = 0 ;
        int cnt = 0 ;
        for (int i = 0 ; i<n;i++){
            if(cnt==0){
                cnt=1;
                el= nums[i];
            }
            else if (el==nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return el ;
    }
}