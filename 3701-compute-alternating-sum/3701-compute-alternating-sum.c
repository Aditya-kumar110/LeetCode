int alternatingSum(int* nums, int numsSize) {
    int sum, sum1= 0, sum2 = 0;
    for(int i = 0;i<numsSize;i++){
        if(i%2==0){
            sum1+=nums[i];
        }
        else{
            sum2+=nums[i];
        }
    }
    sum = sum1-sum2;
    return sum;
}