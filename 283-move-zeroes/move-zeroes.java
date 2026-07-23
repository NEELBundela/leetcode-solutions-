class Solution {
    public void moveZeroes(int[] nums) {
        int i,k=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[k]; //temp=0
                nums[k] = nums[i];  //nums[k]=1
                nums[i] = temp;     //nums[i]=0
                k++;
            }
        }
    }
}