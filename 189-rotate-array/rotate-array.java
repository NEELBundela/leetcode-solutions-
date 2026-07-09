class Solution {
    public void rotate(int[] nums, int k) {
        // int i,last;

        // for(int r=0;r<k;r++){
        //     last = nums[nums.length-1]; //it store last value not index

        //     for(i=nums.length-1;i>0;i--){
        //         nums[i]=nums[i-1];
        //     }
        //     nums[0]=last;
        // }

        k=k%nums.length;

        rev(nums,0,nums.length-1);

        rev(nums,0,k-1);

        rev(nums,k,nums.length-1);
    }

    public void rev(int[] nums,int left,int right){
        while(left<right){

            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            left++;
            right--;
        }
    }
}