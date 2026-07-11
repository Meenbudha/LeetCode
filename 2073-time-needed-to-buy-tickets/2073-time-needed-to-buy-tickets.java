class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < tickets.length; i++){
            q.offer(i);
        }

        while(!q.isEmpty()){
            int person = q.poll();
            tickets[person]--;
            time++;
            if(tickets[person] > 0){
                q.offer(person);
            }
            if(person == k && tickets[k] == 0){
                return time;
            }
        }
        return time;
    }
}