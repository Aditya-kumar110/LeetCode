int sumOfMultiples(int n) {
    int sum = 0 , i = 1;
    while(i<=n){
      if(i %3 == 0){
        sum+= i;
        i++;
      }
      else if(i %5 == 0){
        sum += i;
        i++;
      }
      else if(i % 7 == 0){
        sum += i;
        i++;
      }
      else{
        i++;
      }
    }
    return sum ;
}