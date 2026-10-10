class Solution {
    // Helper method to merge two sorted subarrays
    static void merge(int[] nums, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            left[i] = nums[start + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = nums[mid + 1 + j];
        }

        // Merge temp arrays back into nums
        int i = 0, j = 0, k = start;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }
        
        // Copy remaining elements
        while (i < n1) nums[k++] = left[i++];
        while (j < n2) nums[k++] = right[j++];
    }
    
    // Helper method to sort using divide-and-conquer
    static void mergesort(int[] nums, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergesort(nums, start, mid);           // Left half
            mergesort(nums, mid + 1, end);         // Right half
            
            merge(nums, start, mid, end);          // Merge sorted halves
        }
    }
    
    public int[] sortArray(int[] nums) {
        mergesort(nums, 0, nums.length - 1);
        return nums;  
    }
}