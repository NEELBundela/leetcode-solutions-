class MyStack {
        Queue<Integer> q1;
       // Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList();
       // q2 = new LinkedList();
    }
    
    public void push(int x) {
        int size = q1.size();
        q1.add(x);
        while(size-->0){
            q1.add(q1.poll());
        }


        //using 2 queue
        // while(!q2.isEmpty()){
        //     q1.add(q2.poll());
        // }
        // q2.add(x);
        // while(!q1.isEmpty()){
        //     q2.add(q1.poll());
        // }
    }
    
    public int pop() {
        
        //return q2.poll();
        return q1.poll();
    }
    
    public int top() {
        
        //return q2.peek();
        return q1.peek();

    }
    
    public boolean empty() {
        //return q2.isEmpty();
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */