class Solution {
    public int minSubarray(int[] nums, int p) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(0, -1);

        int sum = 0;
        int totalSum = 0;

        for (int num : nums) {
            totalSum = (totalSum + num) % p;
        }

        int targetRemainder = totalSum % p;
        if (targetRemainder == 0)
            return 0;

        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {
            sum = (sum + nums[i]) % p;
            int neededRemainder = (sum - targetRemainder + p) % p;

            if (hs.containsKey(neededRemainder)) {
                int currentLength = i - hs.get(neededRemainder);
                minLength = Math.min(minLength, currentLength);
            }

            hs.put(sum, i);
        }
        return minLength == nums.length ? -1 : minLength;

    }
}