class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0,cur=nums[0],c=0;
        
        while(j<nums.length){
            // System.out.println(i+" "+j+" "+c+" "+cur);
            if(cur==nums[j]){
                if(c<2){
                    nums[i]=nums[j];
                    i++;
                }
            }
            else{
                cur=nums[j];
                c=0;
                nums[i]=nums[j];
                i++;
            }
            c++;
            j++;
        }
        
        return i;
    }
}