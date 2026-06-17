class MinStack {
   
 Stack<Integer>  mainstk;
Stack<Integer> minStack;
    public MinStack() {
        mainstk = new Stack<>();
        minStack = new Stack<>(); 
    }
    public void push(int val) {
        mainstk.push(val);
        if(minStack.isEmpty() || val <=minStack.peek()){
            minStack.push(val);
        }
    }
    public void pop() {
       if(mainstk.pop().equals(minStack.peek())){
        minStack.pop();
       } 
    }
    public int top() {
        return mainstk.peek();
    }
    public int getMin() {
        return minStack.peek();
    }
}
