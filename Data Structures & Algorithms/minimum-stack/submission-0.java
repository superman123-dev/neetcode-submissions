class MinStack {

        Stack<Integer> stack;
        Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.empty()){
            minStack.push(val);
        } else{
            int i = minStack.peek();
            if(i > val){
                minStack.push(val);
            } else{
                minStack.push(i);
            }
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();

    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
