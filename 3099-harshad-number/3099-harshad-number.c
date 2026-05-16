int sumOfTheDigitsOfHarshadNumber(int x) {
    int original = x, sum = 0;
    while(x>0){
        sum += x % 10;
        x = x/10;
    }
    if(original % sum == 0)
        return sum;
    else 
        return -1;
}