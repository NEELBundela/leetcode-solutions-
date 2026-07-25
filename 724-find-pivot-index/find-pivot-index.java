class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum=0,rightsum=0;
        int total=0;

        for(int num : nums){
            total+=num;
        }

        for(int i=0;i<nums.length;i++){
            rightsum=total-leftsum-nums[i];

            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}