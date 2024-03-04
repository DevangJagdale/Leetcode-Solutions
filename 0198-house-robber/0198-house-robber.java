class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i]=-1;
        }
        return sol(nums,dp,0);
    }

    public int sol(int[] nums, int[] dp, int index){
        if(index>=nums.length-1){
            // Systems.out.println()
            if(index==nums.length-1)return nums[index];
            return 0;
        }
        if(dp[index]!=-1)return dp[index];

        int pick=sol(nums,dp,index+2)+nums[index];
        int notPick=sol(nums,dp,index+1);

        if(pick>notPick){
            dp[index]=pick;
        }else{
            dp[index]=notPick;
        }
        
        return dp[index];
    }
}