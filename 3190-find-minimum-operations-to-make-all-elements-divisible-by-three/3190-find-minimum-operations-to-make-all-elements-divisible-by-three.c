int minimumOperations(int* nums, int numsSize) {
    int minimum = 0;
    for(int i = 0;i<numsSize;i++){
         if(nums[i]%3==0){

         }
         else if(nums[i]%3 > 3){
            nums[i] -1;
            minimum++;
        }
        else if(nums[i]%3 < 3){
            nums[i] + 1;
            minimum++;
        }
    }
    return minimum;
}