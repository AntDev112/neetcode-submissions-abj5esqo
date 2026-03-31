class Solution {
    public int evalRPN(String[] tokens) {
       Stack<String> tokenStack = new Stack<String>();
       List<String> operands = createOperandList();
       for(String token:tokens) {
        if(!operands.contains(token)) {
            tokenStack.push(token);
        } else {
            int num2 = Integer.parseInt(tokenStack.pop());
            int num1 = Integer.parseInt(tokenStack.pop());
            tokenStack.push(""+performOperation(token, num1, num2));
        }
    }
    return Integer.parseInt(tokenStack.pop());  
}

    public int performOperation(String operand, int num1, int num2) {
        int result;
        if(operand.equals("+")) {
            result = num1+num2;
        } else if(operand.equals("-")) {
            result = num1-num2;
        } else if(operand.equals("*")) {
            result = num1*num2;
        } else {
            result = num1/num2;
        }
        return result;
    }

    public List<String> createOperandList() {
        List<String> operands = new ArrayList<>();
        operands.add("+");
        operands.add("-");
        operands.add("/");
        operands.add("*");
        return operands;
    }
}
