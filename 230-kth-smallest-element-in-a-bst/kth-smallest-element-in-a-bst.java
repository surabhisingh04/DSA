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

    int pos = 0 ;
    public int kthSmallest(TreeNode root, int k) {
        TreeNode n = inorder(root,k);
        return n.val;

        
    }
    public TreeNode inorder(TreeNode h , int s){
        if(h ==null){
            return null;
        }
        TreeNode left = inorder(h.left ,s);
        if(left!=null){
            return left ;
        }
        pos++;
        if(pos==s){
            return h ;
        }
        return inorder(h.right ,s);
    }
}