int comp(const void* a, const void* b) { return (*(int*)a - *(int*)b); }
bool isGood(int* nums, int numsSize) {
    
    qsort(nums, numsSize, sizeof(nums[0]), comp);
        int max = nums[numsSize-1];

    for (int i = 0; i < numsSize - 2; i++) {
        if (nums[i] + 1 != nums[i + 1]) {
            return false;
        }
    }
   
    if (max + 1 == numsSize && nums[numsSize - 2] == max) {
        return true;
    }
    return false;
}