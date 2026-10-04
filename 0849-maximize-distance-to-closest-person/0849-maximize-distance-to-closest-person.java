class Solution {
    public int maxDistToClosest(int[] seats) {
        int dist = 0;
        int n = seats.length;
        int last = -1;

        for(int i = 0; i < n; i++){
            if(seats[i] == 1){
                if(last == -1){
                    dist = i;
                } else {
                    dist = Math.max(dist, (i - last) / 2);
                }
                last = i;
            }
        }
        dist = Math.max(dist, n - 1 - last);
        return dist;
    }
}