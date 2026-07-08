class Solution {
    public int removeDuplicates(int[] nums) {
        int i,k=1;
        for(i=1;i<nums.length;i++){
            if(nums[i]==nums[k-1]){
                
                continue;
            }else{
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}