class KthLargest {
    private PriorityQueue<Integer> pq;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.pq = new PriorityQueue<Integer>();
        populate(nums,pq);
        while(pq.size() > k) {
            pq.poll();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        while(pq.size() > k) {
            pq.poll();
        }
        return pq.peek();
    }

    public void populate(int[] nums, PriorityQueue<Integer> pq) {
        for(int num:nums){
            pq.add(num);
        }
    }

}

