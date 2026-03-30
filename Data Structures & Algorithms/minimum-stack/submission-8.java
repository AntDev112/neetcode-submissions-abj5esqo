class MinStack {
    List<Integer> stack;
    List<Integer> minList;
    int pointer;
    int minPointer;

    public MinStack() {
       stack = new ArrayList<>();
       minList = new ArrayList<>();
       minList.add(Integer.MAX_VALUE);
       pointer = -1;
       minPointer = 0;
    }
    
    public void push(int val) {
        stack.add(val);
        pointer++;
        if (val <= minList.get(minPointer)) {
            minList.add(val);
            minPointer++;
        }
    }
    
    public void pop() {
        int poppedVal = stack.remove(pointer);
        if (poppedVal == minList.get(minPointer)) {
            minList.remove(minPointer);
            minPointer--;
        }
        pointer--;
    }
    
    public int top() {
        return stack.get(pointer);
    }
    
    public int getMin() {
        System.out.println(Arrays.toString(minList.toArray()));
        System.out.println(minPointer);
        return minList.get(minPointer);
    }
}
