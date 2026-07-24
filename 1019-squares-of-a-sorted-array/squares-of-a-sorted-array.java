class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sq = new int[nums.length];
        int l=0,r=sq.length-1;
        for(int i=0;i<nums.length;i++){
             sq[i]=nums[i]*nums[i];
        }
       Arrays.sort(sq);
        return sq;
    }
}