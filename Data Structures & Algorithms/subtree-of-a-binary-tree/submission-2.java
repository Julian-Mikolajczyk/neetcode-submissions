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
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if(subRoot == null) return true;
    if(root == null) return false;
    if(isTheSameTree(root, subRoot)){
      return true;
    }else{
      return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
  }
  public boolean isTheSameTree(TreeNode root, TreeNode subRoot){
    if(root == null && subRoot == null){
      return true;
    }
    else if(root != null && subRoot != null && root.val == subRoot.val){
      return isTheSameTree(root.left, subRoot.left) && isTheSameTree(root.right, subRoot.right);
    }
    else{
      return false;
    }
  }
}
