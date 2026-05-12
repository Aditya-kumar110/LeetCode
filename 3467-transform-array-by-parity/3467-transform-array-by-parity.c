/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* transformArray(int* nums, int numsSize, int* returnSize) {
    for(int i = 0;i<numsSize;i++){
        if(nums[i]%2==0){
            nums[i] = 0;
        }
        else{
            nums[i] = 1;
        }
    }
    for(int i = 0;i<numsSize-1;i++){
        for(int j =i+ 1;j<numsSize;j++){
            if(nums[i]>nums[j]){
                int temp;
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            }
        }
    }
    *returnSize = numsSize;
    return nums;
}