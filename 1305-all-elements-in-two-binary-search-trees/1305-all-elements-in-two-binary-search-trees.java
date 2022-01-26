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
 */class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Stack<Integer> list1 = new Stack<>();
        Stack<Integer> list2 = new Stack<>();
        List<Integer> ans = new LinkedList<>();
        dfs(root1, list1);
        dfs(root2, list2);
        
        while(!list1.empty() && !list2.empty()){
            if(list1.peek()>=list2.peek())
                ans.add(0,list1.pop());
            else
                ans.add(0,list2.pop());
        }
        while(!list1.empty())
            ans.add(0,list1.pop());
        while(!list2.empty())
            ans.add(0,list2.pop());
        
        return ans;
    }
    
    void dfs(TreeNode root, Stack list){
        if(root==null)
            return;
        dfs(root.left, list);
        list.push(root.val);
        dfs(root.right, list);
    }
}