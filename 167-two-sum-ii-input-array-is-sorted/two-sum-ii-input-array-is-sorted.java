class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left = 0 ;
        int right = numbers.length-1;
        int ans[]= new int[2];
        while(left<right){
            int sum = numbers[left]+numbers[right];


            if(sum<target){
                left++;
            }
            else if(sum>target){
                right--;
            }
            else{
                ans[0]=left+1;
                ans[1]=right+1;
                return ans;
            }
        }
        return ans;
    }
}