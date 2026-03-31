class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = getPriorityQueue(stones);
        while(pq.size() > 1) {
            int x = pq.poll();
            int y = pq.poll();
            if(x > y) {
                pq.add(x-y);
            }
            else if(x<y) {
                pq.add(y-x);
            }
        }

        return pq.size() == 0 ? 0:pq.poll();
    }

    public PriorityQueue<Integer> getPriorityQueue(int[]arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int num:arr){
            pq.add(num);
        }
        return pq;
    }
}
