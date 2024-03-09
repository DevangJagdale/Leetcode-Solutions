class Solution {
    public int lengthOfLIS(int[] nums) {
        int lis=1;
        int[] dp=new int[nums.length];
        for(int i=0;i<nums.length;i++)dp[i]=1;
        for(int i=nums.length-1;i>-1;i--){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
            }
            lis=Math.max(lis,dp[i]);
        }
        
        return lis;
    }
}