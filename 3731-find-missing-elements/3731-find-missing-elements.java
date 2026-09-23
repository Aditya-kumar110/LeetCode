// You are given an integer array nums consisting of unique integers.

// Originally, nums contained every integer within a certain range. However, some integers might have gone missing from the array.

// The smallest and largest integers of the original range are still present in nums.

// Return a sorted list of all the missing integers in this range. If no integers are missing, return an empty list.
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int len = nums.length;
        for(int n : nums){
            if(n<min) min = n;
            if(n>max) max = n;
        }
        List<Integer> missing = new ArrayList<>();
        for(int i = min; i <=max;i++){
            int k = 0;
            for(int j = 0 ; j< len;j++){
                if(i == nums[j]){
                    k = 1;
                    continue;
                }
                
            }
            if(k == 0){
                missing.add(i);
            }

        }
        return missing;
    }
}