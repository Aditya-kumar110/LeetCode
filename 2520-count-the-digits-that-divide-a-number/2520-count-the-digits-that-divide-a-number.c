int countDigits(int num) {
    int orginal = num , count = 0 , value ;
    while(num>0){
        value = num % 10;
        num = num / 10;

        if( orginal % value == 0) {
            count++;
        }
    }
    return count;
}