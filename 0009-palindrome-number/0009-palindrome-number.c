bool isPalindrome(int x) {
    long int original = x , reverse = 0;
    while(x>0){
        reverse = (x % 10) + (reverse*10);
        x = x/10;
    }
    return original == reverse;
}