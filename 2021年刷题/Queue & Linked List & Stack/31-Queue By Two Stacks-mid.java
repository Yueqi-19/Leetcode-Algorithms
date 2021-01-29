public class Solution {
  private Deque<Integer> s1; 
  private Deque<Integer> s2;
  public Solution() {
    s1 = new ArrayDeque<>();
    s2 = new ArrayDeque<>();
  }
  public Integer poll() {
    if (s1.isEmpty() && s2.isEmpty()) {
      return null;
    }
    shuffle(s1, s2);
    return s2.pollFirst();
  }
  
  public void offer(int element) {
    s1.offerFirst(element);
  }
  
  public Integer peek() {
    if (s1.isEmpty() && s2.isEmpty()) {
      return null;
    }
    shuffle(s1, s2);
    return s2.peekFirst();
  }
  
  public int size() {
    return s1.size() + s2.size();
  }
  
  public boolean isEmpty() {
    return s1.isEmpty() && s2.isEmpty();
  }
  public void shuffle(Deque<Integer> s1, Deque<Integer> s2) {
    if (s2.isEmpty()) {
      while (!s1.isEmpty()) {
        s2.offerFirst(s1.pollFirst());
      }
    }
  }
}
