class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int left = 1;
        int right = 1;
        int ans = nums[0];


        for(int i = 0;i<len;i++){
            left = left==0?1 : left;
            right = right==0?1 : right;

            left *=nums[i];
            right*=nums[len-1-i];

            ans=Math.max(ans,Math.max(left,right));;
        }
        return ans;
    }
}