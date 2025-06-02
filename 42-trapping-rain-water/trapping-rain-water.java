class Solution {
    public int trap(int[] height) {
        int ans= 0 ;
        int leftmax=0 ;
        int rightmax =0 ;
        int left=0 ;
        int right = height.length-1;
        while (left<right){
            leftmax= Math.max(leftmax,height[left]);
            rightmax= Math.max(rightmax,height[right]);
            if (height[left]<height[right]){
                ans+=leftmax-height[left];
                left++;

            }
            else{
                ans+=rightmax-height[right];
                right--;
            }
        }
        return ans;
    }
}