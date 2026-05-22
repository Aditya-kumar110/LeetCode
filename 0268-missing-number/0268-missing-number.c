int
missingNumber(int *arr, int narr)
{
        int out = 0;
        for (int i = 0; i < narr; i++) {
                out += arr[i];
                out -= i;
        }

        out -= narr;
        return -out;
}