class Solution {
    public int removeDuplicates(int[] nums) {
        int i,k=2,count=0;
        for(i=2;i<nums.length;i++){
            if(nums[i]==nums[k-2]){
                count++;
                if(count>=2){
                    continue;
                }
            }else{
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}