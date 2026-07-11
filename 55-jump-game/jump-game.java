class Solution {
    public boolean canJump(int[] nums) {
        int maxreach=0,i;
        for(i=0;i<nums.length;i++){
            if(i>maxreach){
                return false;
            }
            maxreach=Math.max(maxreach,i+nums[i]);
            
        }
        
        return true;
    }
}