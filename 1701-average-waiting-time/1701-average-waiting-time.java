class Solution {
    public double averageWaitingTime(int[][] customers) {
        double finish = 0, waiting_time = 0;
        double sum = 0 ;
        for (int i = 0; i < customers.length; i++) {
            int arrival = customers[i][0];
            int time = customers[i][1];
            finish =   Math.max(arrival, finish) + time;
            waiting_time =   finish - arrival;
            sum = sum + waiting_time;
        }
        return (double) sum/customers.length;
    }
}