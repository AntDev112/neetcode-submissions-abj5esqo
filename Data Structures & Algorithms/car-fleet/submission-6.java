class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        for (int i = 0; i < position.length; i++) {
            double [] a = new double [2];
            a[0] = position[i];
            double time = (double) (target - position[i]) / speed[i];
            a[1] = time;
            pq.add(a);
        }
        Stack<Double> stack = new Stack<>();
        while(pq.size() != 0) {
            double time = pq.poll()[1];
            if(stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }

        return stack.size();

    }
}
