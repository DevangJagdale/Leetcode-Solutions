class Solution {
    int[] dp;
    boolean first=true;
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        dp=new int[nums.length];
        for(int i=0;i<nums.length;i++)dp[i]=-1;
        int pick=sol(nums,dp, 0, true);
        dp=new int[nums.length];
        for(int i=0;i<nums.length;i++)dp[i]=-1;
        int notPick=sol(nums,dp, 1, false);
        return Math.max(pick,notPick);
    }
    
    public int sol(int[] nums, int[] dp, int index, boolean start){
        if(index>=nums.length-1){
            if((index == nums.length-1 && start==true) || index > nums.length-1){
                return 0;
            }
            else{
                // System.out.println(index);
                return dp[index]=nums[index];
            }
        }
        
        if(dp[index]!=-1)return dp[index];
        
        int pick=sol(nums,dp,index+2,start)+nums[index];
        int notPick=sol(nums,dp,index+1,start);
        
        // System.out.println(index+" "+pick+" "+notPick+" "+start);
        
        return dp[index]=Math.max(pick,notPick);
    }
}