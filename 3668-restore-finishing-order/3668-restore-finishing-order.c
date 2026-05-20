/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* recoverOrder(int* order, int orderSize, int* friends, int friendsSize, int* returnSize) {
    int* arr = (int*)malloc(orderSize * sizeof(int));
    int size = 0;

    for (int i = 0; i < orderSize; i++) {
        int low = 0;
        int high = friendsSize - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (order[i] == friends[mid]) {
                arr[size++] = friends[mid];
                break;
            } else if (order[i] > friends[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
    
    *returnSize = size;
    return arr;
}