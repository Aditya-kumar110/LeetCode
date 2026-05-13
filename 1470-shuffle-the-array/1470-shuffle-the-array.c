

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize){
int *arr = (int *) malloc((2*n)*sizeof(int));
*returnSize = 2*n;
int left = 0 , right = 1, i = 0;
while(right<=numsSize-1){
    arr[left] = nums[i];
    arr[right] = nums[n+i];
    left+=2;
    right += 2;
    i++;
}
return arr;
}