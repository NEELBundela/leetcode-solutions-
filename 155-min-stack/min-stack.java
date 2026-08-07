class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;
    public MinStack() {
        stack = new Stack();
        minstack = new Stack();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty() || minstack.peek()>=val){ //1 2 3 -1 0 -1 
            minstack.push(val);
        }//else{
        //     minstack.push(minstack.peek());//it store peek of minstack value
        // }
    }
    
    public void pop() {
        if(stack.peek().equals(minstack.peek())){ //-1==-1 so it remove -1 from minstack
            minstack.pop();
        }
        stack.pop();
       
    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek(); //that why error comes here,that why we take = to in if condition
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */