class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<int[]>();
        for (int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];
            while (!stack.isEmpty() && t > stack.peek()[0]) {
                int [] currTemp = stack.pop();
                int temp = currTemp[0];
                int tempIndex = currTemp[1];
                result[tempIndex] = i - tempIndex; 
            }
            int [] toAdd = {t, i};
            stack.push(toAdd);
        }

        return result;
    }
}
