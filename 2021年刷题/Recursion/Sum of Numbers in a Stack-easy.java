class Solution {
	public int sumOfStack(Deque<Integer> stack) {
    int sum=stack.poll();
    while(!stack.isEmpty()){
      sum +=stack.poll();
    }
    return sum;
	}
}