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
    public int countNodes(TreeNode root) {
      int result =0;
        if(root==null){
            return result;
        }
        Queue <TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            
            int levelsize = queue.size();

            for ( int i = 0 ; i<levelsize ;i++){

                TreeNode current = queue.poll();
                result++;
                
                
                if(current.left!=null){
                    queue.offer(current.left);
                }
                 if(current.right!=null){
                    queue.offer(current.right);
                }
            }
            
        }
        return result;
    }
}
    
