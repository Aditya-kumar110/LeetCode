class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<nums.length;i++){
            if(hs.contains(nums[i])){
                list.add(nums[i]);
            }
            else{
                hs.add(nums[i]);
            }
        }
        return list;
    }
}