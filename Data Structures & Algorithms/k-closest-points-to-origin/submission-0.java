class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = getPriorityQueue(points);
        int[][] result = new int[k][k];
        int i = 0;
        while(i < k && !pq.isEmpty()) {
            result[i] = pq.poll();
            i++;
        }
        return result;
    }

    public PriorityQueue<int[]> getPriorityQueue(int[][] points) {
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
        int d1 = a[0]*a[0] + a[1]*a[1];
        int d2 = b[0]*b[0] + b[1]*b[1];
        return d1 - d2;  
    });

        for(int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
            pq.add(points[i]);
        }

        return pq;
    }
}
