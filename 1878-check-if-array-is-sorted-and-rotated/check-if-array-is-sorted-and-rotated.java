class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
            }
        }
        
        // Also check if the last element is less than the first element, which indicates a rotation point.
        if (nums[nums.length - 1] > nums[0]) {
            count++;
        }
        
        // If there is more than one drop, it's not a rotated sorted array
        return count <= 1;
    }
}

