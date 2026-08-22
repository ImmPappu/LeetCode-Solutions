class MyStack {
    Queue <Integer> q = new LinkedList<>();
    Queue <Integer> q2 = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
        
       
    }
    
    public int pop() {
        while(q.size()>1){
            q2.add(q.remove());
        }
        int front = q.remove();
        while(q2.size()>0){
            q.add(q2.remove());
        }
        return front;
       
    }
    
    public int top() {
        while(q.size()>1){
            q2.add(q.remove());
        }
        int front = q.peek();
        q2.add(q.remove());
        while(q2.size()>0){
            q.add(q2.remove());
        }
        return front;
    }
    public boolean empty() {
        return (q.size()==0);
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