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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        

        while(!queue.isEmpty()){
            int levelsize = queue.size();
            double avg = 0;

        for(int i = 0 ; i<levelsize;i++){
            TreeNode currentNode = queue.poll();
            avg+=currentNode.val;
            if(currentNode.left!=null){
                queue.offer(currentNode.left);
            }
             if(currentNode.right!=null){
                queue.offer(currentNode.right);
            }


        }
        avg= avg/levelsize;
        result.add(avg);
     }
      return result ;  
    }
}