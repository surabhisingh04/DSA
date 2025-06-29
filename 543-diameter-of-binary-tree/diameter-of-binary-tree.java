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
    int diamter = 0 ;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diamter-1;

        
    }
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }

       int lh=height(node.left);
       int  rh=height(node.right);

        diamter = Math.max(diamter,lh+rh+1);

        return Math.max(lh,rh)+1;
    }
}