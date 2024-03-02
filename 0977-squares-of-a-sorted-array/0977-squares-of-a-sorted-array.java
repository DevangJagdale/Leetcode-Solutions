class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,r=nums.length-1;
        int[] ans=new int[nums.length];
        int i=nums.length-1;
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                ans[i]=nums[l]*nums[l];
                l++;
            }
            else{
                ans[i]=nums[r]*nums[r];
                r--; 
            }
            i--;
        }
        
        return ans;
    }
}