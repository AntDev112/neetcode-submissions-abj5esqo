class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String operation = operations[i];
            if (operation.equals("+")) {
                int total = scores.peek() + scores.get(scores.size() - 2);
                scores.push(total);
            } else if(operation.equals("D")) {
                scores.push(scores.peek()*2);
            } else if (operation.equals("C")) {
                scores.pop();
            } else {
                int addedVal = Integer.parseInt(operation);
                scores.push(addedVal);            
            }
        }

        System.out.printf("%s \n", scores.toString());
        return scores.stream().mapToInt(Integer::intValue).sum();
    }
}