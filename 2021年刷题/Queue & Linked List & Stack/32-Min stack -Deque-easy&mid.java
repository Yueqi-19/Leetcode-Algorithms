//最小栈 easy 版本 双端队列
class MinStack {

    /** initialize your data structure here. */
    Deque<Integer> mStack;
    Deque<Integer> minStack;
    public MinStack() {
        mStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);

    }
    
    public void push(int x) {
        mStack.push(x);
        minStack.push(Math.min(minStack.peek(),x));
    }
    
    public void pop() {
        mStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return mStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */


# 链接：https://leetcode-cn.com/problems/min-stack/solution/di-yi-bian-xian-ba-da-an-chao-hui-by-gavin-131/

// 最小栈 mid 版本 双端队列
public class Solution {
  private Deque<Integer> stack;
  private Deque<Integer> minStack;
  public Solution() {
    stack = new LinkedList<Integer>();
    minStack = new LinkedList<Integer>();
  }
  public Integer min() {
    if (minStack.isEmpty()){
      return -1;
    }
    return minStack.peekFirst();
  }
  public void push(int value){
    stack.offerFirst(value);
    if(minStack.isEmpty()|| value <= minStack.peekFirst()){
      minStack.offerFirst(value);
    }
  }
  public Integer pop(){
    if(stack.isEmpty()){
      return -1;
    }
    Integer result = stack.pollFirst();
    if (minStack.peekFirst().equals(result)){
      minStack.pollFirst();
    }
    return result;
  }
  public Integer top(){
    if(stack.isEmpty()){
      return -1;
    }
    return stack.peekFirst();
  }
}