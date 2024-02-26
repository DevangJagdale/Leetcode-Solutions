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
        if(p==null && q==null)return true;
        if((p==null || q==null) || p.val!=q.val)return false;
        
        if(p.left!=null && q.left!=null){
            if(!isSameTree(p.left,q.left))return false;
        }
        else if(p.left==null && q.left==null){}
        else return false;
        
        if(p.right!=null && q.right!=null){
            if(!isSameTree(p.right,q.right))return false;
        }
        else if(p.right==null && q.right==null){}
        else return false;
        
        return true;
    }
}