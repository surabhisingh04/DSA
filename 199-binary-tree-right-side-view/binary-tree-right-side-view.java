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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue <TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List <Integer>  currentlevel = new ArrayList<>() ;
            int levelsize = queue.size();

            for ( int i = 0 ; i<levelsize ;i++){

                TreeNode current = queue.poll();
                currentlevel.add(current.val);
                if(i==levelsize-1){
                    result.add(current.val);
                }
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