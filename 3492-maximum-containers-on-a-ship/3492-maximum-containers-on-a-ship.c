int maxContainers(int n, int w, int maxWeight) {
    int possibleweight = maxWeight/w;
    if(maxWeight>(n*n*w)){
    return n*n;
    }
    else{
        return possibleweight;
    }
}