class Solution {
    public void sortColors(int[] nums) {
        for(int i  = 0 ; i<nums.length-1; i++){
            int min = nums[i];
            int index = i;
            for(int j = i + 1; j<nums.length;j++){
                if(min>nums[j]){
                    min = nums[j];
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = min;
            nums[index] = temp;
        }

    }
}