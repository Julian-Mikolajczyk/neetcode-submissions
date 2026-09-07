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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();

        q1.add(p);
        q2.add(q);

        while(!q1.isEmpty() && !q2.isEmpty()){
          for(int i = q1.size(); i > 0; i--){
            TreeNode temp1 = q1.poll();
            TreeNode temp2 = q2.poll();
            if(temp1 == null && temp2 == null) continue;
            if(temp1 == null || temp2 == null || temp1.val != temp2.val) return false;

            q1.add(temp1.left);
            q1.add(temp1.right);
            q2.add(temp2.left);
            q2.add(temp2.right);
          }
        }
        return true;

    }
}
