class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int ans=nums[i]+nums[j];
                if(ans==target){
                   return new int[]{i,j};
                }

            }
        }
       return new int[]{};
    }
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr={2,7,11,15};
        int target=9;

        s.twoSum(arr,target);
    }
}