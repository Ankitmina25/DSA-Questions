class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr = new int[n];
        for(int i=0;i<bookings.length;i++){
            int first=bookings[i][0]-1;
            int sec=bookings[i][1]-1;
            int seats=bookings[i][2];
            for(int j=first;j<=sec;j++){
                arr[j]+=seats;
            }
        }
        return arr;
    }
}