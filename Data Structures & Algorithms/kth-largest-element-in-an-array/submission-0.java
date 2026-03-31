class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> pq = getPriorityQueue(nums);
      int i = 0;
      while(i < k-1) {
        pq.poll();
        i++;
      }
      return pq.poll();
    }

    public PriorityQueue<Integer> getPriorityQueue(int [] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            return b-a;
        });

        for(int num:nums) {
            pq.add(num);
        }

        return pq;
    }

}
