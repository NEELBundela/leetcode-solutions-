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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if(root==null){
            return list;
        }
        
    
    
        Queue<TreeNode> node = new LinkedList<>();
        node.add(root);

        while(!node.isEmpty()){
            int size = node.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0;i<size;i++){
            TreeNode treenode = node.poll();

            level.add(treenode.val);

            if(treenode.left!=null){
                node.add(treenode.left);
            }
            if(treenode.right!=null){
                node.add(treenode.right);
            }
            }
            list.add(level);
        }
        return list;
    }
}