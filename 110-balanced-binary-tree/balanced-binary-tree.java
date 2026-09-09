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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
    //top - bottom     // if(Math.abs(height(root.left)-height(root.right))>1) return false;
        // return isBalanced(root.left) && isBalanced(root.right);
        return height(root) != -1;
    }
    //top-bottom 


    // public int height(TreeNode root){
    //     if(root==null) return 0;
    //     return 1+Math.max(height(root.left),height(root.right));
    // }

    public int height(TreeNode root){
        if(root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        int bf = Math.abs(left-right);

        if(bf>1 || left == -1 || right == -1)return -1;
        return 1 + Math.max(left,right);
    }
}