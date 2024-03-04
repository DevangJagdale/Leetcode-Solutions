class Solution {
    int[] ans;
    public int climbStairs(int n) {
        ans=new int[n+1];
        sol(n);
        return ans[n];
    }
    
    public int sol(int n){
        // System.out.println(n);
        if(n==0){
            return 1;
        }
        if(n<0)return 0;
        if(ans[n]!=0)return ans[n];
        
        ans[n]=sol(n-1)+sol(n-2);
        
        return ans[n];
    }
}