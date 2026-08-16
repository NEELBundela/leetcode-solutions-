class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        // Remainder 0 exists once before the array starts
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            sum += num;

            int remainder = sum % k;

            // Java can give negative remainders
            if (remainder < 0) {
                remainder += k;
            }

            if (map.containsKey(remainder)) {
                count += map.get(remainder);
            }

            map.put(
                remainder,
                map.getOrDefault(remainder, 0) + 1
            );
        }

        return count;
    }
}