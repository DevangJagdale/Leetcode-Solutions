class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] count=new int[nums.length+1];
        List<Integer> ans=new ArrayList<Integer>();
        for(int n:nums){
            count[n]++;
            if(count[n]==2)ans.add(n);
        }
        
        return ans;
    }
}