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
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        ans=0;
        sol(root,0);
        return ans;
    }
    
    public int sol(TreeNode root, int d){
        if(root==null)return 0;
        
        if(root.left==null && root.right==null)return 1;
        
        int l=sol(root.left,d+1);
        int r=sol(root.right,d+1);
        
        ans=Math.max(ans,(l+r));
        
        // System.out.println(l+" "+r+" "+root.val+" "+d+" "+ans);
        
        return Math.max(l,r)+1;
    }
}