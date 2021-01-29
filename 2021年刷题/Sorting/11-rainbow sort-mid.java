public class Solution {
  public int[] rainbowSort(int[] array) {
    if (array.length == 0) {
      return array;
    }
    int i = 0;
    int j = 0;
    int k = array.length - 1;
    while (j <= k) {
      if (array[j] == 0) {
        j++;
      } else if (array[j] == 1) {
        swap(array, j, k--);
      } else {
        swap(array, i++, j++);
      }
    }
    return array;
  }
  private void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
