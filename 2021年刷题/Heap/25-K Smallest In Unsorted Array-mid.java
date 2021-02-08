public class Solution {
  public int[] kSmallest(int[] array, int k) {
    if (array.length ==0||k == 0) {
      return new int[0];
    }
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
      @Override
      public int compare(Integer a, Integer b) {
        if (a == b) {
          return 0;
        }
        if(a < b){
          return 1;
        }
        return -1;
      }
    });
    for (int i = 0; i < array.length; i++) {
      if (i < k) {
        maxHeap.offer(array[i]);
      } else {
        if (array[i] < maxHeap.peek()) {
          maxHeap.poll();
          maxHeap.offer(array[i]);
        }
      }
    }
	 int[] res = new int[k];
    for (int i = k -1; i >= 0; i--) { // i-- why
      res[i] = maxHeap.poll();
    }
    return res;
  }
}
