class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int beforecurr = 1;
        int aftercurr = 1;

        for(int i = 0;i<n;i++){
           res[i] = beforecurr;
           beforecurr*=nums[i];
        }

        for(int i=n-1;i>=0;i--){
            res[i]*=aftercurr;
            aftercurr*=nums[i];
        }
        return res;
    }
}