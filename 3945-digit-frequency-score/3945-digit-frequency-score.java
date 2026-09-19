class Solution {
    public int digitFrequencyScore(int n) {
        int value = 0;
        String numstr = String.valueOf(n);
        int len = numstr.length();
        int dig[] = new int[len];
        int k = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            dig[k] = digit;
            k++;
        }
        for (int i = 0; i <= 9; i++) {
            int count = 0;
            for (int j = 0; j < len; j++) {
                if (dig[j] == i) {
                    count++;
                }
            }
            value = value + (count * i);
        }
        return value;
    }
}