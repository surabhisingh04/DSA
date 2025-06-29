/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
       return cbst(nums,0,nums.length-1);
        
    }
    public TreeNode cbst(int nums [] , int l  ,int r )
    {
        if(l>r){
            return null ;
        }
        int mid = (l+r)/2;
        TreeNode root = new TreeNode (nums[mid]);
        root.left = cbst(nums  ,  l  , mid-1 );
        root.right = cbst( nums  , mid+1 , r );

        return root;
    }
}

    

