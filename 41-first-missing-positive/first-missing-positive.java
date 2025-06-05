class Solution {
    public int firstMissingPositive(int[] nums) 
    {
        int n = nums.length;
        for (int i = 0 ; i< n ;i ++)
        {
            //visit and mark -ve and 0 n+1
            if(nums[i]<=0 || nums[i]>=(n+1))
            {
                nums[i]=(n+1);
                    } 
        }

        for (int i = 0 ; i<n ; i++)
        {
            // visit element 
            int element =Math.abs(nums[i]);
            if ( element == n+1){
                continue ;
            }
            int seat = element-1;
            if (nums[seat]>0){
                nums[seat]=-nums[seat];
            }
        }
        // find first +ve number 
        for ( int i = 0 ;i<n;i++)
        {
            if(nums[i]>0){
                return (i+1);

            }


        }
        return n+1;
    }
}
