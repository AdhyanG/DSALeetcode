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
    List<List<Integer>> res = new ArrayList<>();
    int level = 1;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        DFS(res, level, root);
        return res;
        
    }
    private void DFS(List<List<Integer>> res, int level, TreeNode root){
        if(root == null)
            return;
        if(level > res.size()){
            List<Integer> list = new ArrayList<>();
            res.add(list);
        }
        if(level % 2 == 1)
            res.get(level - 1).add(root.val);
        else
            res.get(level - 1).add(0, root.val);
        
        if(root.left != null)
            DFS(res, level + 1, root.left);
        if(root.right != null)
            DFS(res, level + 1, root.right);
    }
}