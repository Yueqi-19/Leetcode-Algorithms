public class Solution {
  public void swap(int[] array, int i, int j) {//注意区分 swap 和 reverse
    int temp = array [i];
    array [i] =array [j];
    array[j]=temp;
  }
}

