class MinStack {
    long min = Integer.MAX_VALUE;
    Stack<Long> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()) {
            min = val;
            stack.push((long)val);
        }else{
            if(val > min) stack.push((long)val);
            else {
                stack.push(2L*val - min);
                min = val;
            }
        }
        
    }
    
    public void pop() {
      if(stack.isEmpty()) return;
      long x = stack.peek();
      stack.pop();
      if(x < min) min = 2*min - x;
    }
    
    public int top() {
        if(stack.isEmpty()) return -1;
        long x = stack.peek();
        if(min < x) return (int)x;
        return (int)min;
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
