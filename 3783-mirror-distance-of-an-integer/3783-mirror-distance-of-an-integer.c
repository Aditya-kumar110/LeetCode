int mirrorDistance(int n) {
    int reverse = 0;
    int origin = n;
    while(n>0){
        reverse = (reverse * 10) + (n % 10);
        n = n/10;
    }
    return abs(origin - reverse);
}