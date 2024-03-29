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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        int ans=0;
        q.add(root);
        
        while(!q.isEmpty()){
            int n=q.size();
            ans=q.peek().val;
            while(n>0){
                TreeNode temp=q.poll();
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null){
                    q.add(temp.right);
                }
                n--;
            }
        }
        
        return ans;
    }
}