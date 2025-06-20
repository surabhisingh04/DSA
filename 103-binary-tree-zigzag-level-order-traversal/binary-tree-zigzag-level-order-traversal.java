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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> result = new ArrayList<>();

         if(root==null){
            return new ArrayList<>();
         }

         Deque<TreeNode> queue = new LinkedList<>();
         queue.offer(root);
         boolean rev = false ;

         while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer>currentlevel = new ArrayList<>(levelsize);
            for (int i = 0 ; i<levelsize;i++){
            if(!rev){
                TreeNode current = queue.pollFirst();
                currentlevel.add(current.val);
                if(current.left!=null){
                    queue.addLast(current.left);
                }
                if(current.right!=null){
                    queue.addLast(current.right);
                }

            }
            else{
                TreeNode current = queue.pollLast();
                currentlevel.add(current.val);
                if(current.right!=null){
                    queue.addFirst(current.right);
                }   
                if(current.left!=null){
                    queue.addFirst(current.left);
                }
                 
            }
            

         }
         rev=!rev;

         result.add(currentlevel);
         }
         return result;
    }
}

           
