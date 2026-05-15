int findClosest(int x, int y, int z) {
    int person1 = abs(z-x);
    int person2 = abs(z-y);
    if(person1>person2)
        return 2;
    if(person1<person2)    
        return 1;
        return 0;   
    
}