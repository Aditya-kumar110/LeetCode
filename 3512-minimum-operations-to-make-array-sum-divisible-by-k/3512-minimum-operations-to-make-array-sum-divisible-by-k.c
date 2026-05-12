int minOperations(int* nums, int numsSize, int k) {
    int sum = 0, minOperation = 0;
    for(int i = 0;i<numsSize;i++){
        sum = sum + nums[i];
    }
    if(sum == k){
        return 0;
    }
    else if(sum>k){
        minOperation = sum % k ;
        return minOperation;
    }

    else {
        return sum;
    }
}