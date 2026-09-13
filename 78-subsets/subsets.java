class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0, new ArrayList<>());
        return result;
    }

    private void backtrack(int[] nums, int index, List<Integer> current) {
        
        if (index == nums.length) {
            result.add(new ArrayList<>(current));  
            return;
        }

       
        current.add(nums[index]);
        backtrack(nums, index + 1, current);
        current.remove(current.size() - 1); 
        
        backtrack(nums, index + 1, current);
    }
}