class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
               return true;
            
        }
        map.put(nums[i],i);
        
    }
    return false;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,1};

        Solution s = new Solution();
        s.containsDuplicate(nums);
    }
}