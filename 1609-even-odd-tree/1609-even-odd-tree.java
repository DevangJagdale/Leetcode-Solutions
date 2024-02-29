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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        
        q.add(root);
        boolean even=true;
        while(!q.isEmpty()){
            // System.out.println(q);
            int n=q.size();
            int prev=-1;
            while(n>0){
                TreeNode temp=q.poll();
                if(even){
                    if(temp.val%2==0){
                        // System.out.println("*"+n);
                        return false;
                    }
                    if(prev!=-1){
                        if(temp.val<=prev){
                            // System.out.println("*");
                            return false;
                        }
                    }
                    // System.out.println(prev+" "+temp.val);
                    prev=temp.val;
                }
                else{
                    // System.out.println(prev+" "+temp.val);
                    if(temp.val%2!=0){
                        // System.out.println("*");
                        return false;
                    }
                    if(prev!=-1){
                        // System.out.println("*");
                        // System.out.println(prev+" "+temp.val);
                        if(temp.val>=prev){
                            // System.out.println("**");
                            return false;
                        }
                    }
                    // System.out.println(prev+" "+temp.val);
                    prev=temp.val;
                }
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
                n--;
            }
            if(even==true)even=false;
            else even=true;
        }
        
        return true;
    }
}