public class Solution {
  public int[] quickSort(int[] array) {
    if (array == null || array.length <= 1) {
      return array;
    }
    quickSort(array, 0, array.length - 1);
    return array;
  }
  private void quickSort(int[] array, int left, int right) {
    if (left >= right) {
      return;
    }
    int pivotIndex = patition(array, left, right);
    quickSort(array, left, pivotIndex - 1);
    quickSort(array, pivotIndex + 1, right);
  }
  private int patition(int[] array, int left, int right) {
    int randomNum = left + findRandom(right - left);
    int L = left; 
    int R = right - 1;
    swap(array, randomNum, right);
    while (L <= R) {
      if(array[L] <= array[right]) {
        L++;
      } else {
        swap(array, L, R--);
      }
    }
    swap(array, L, right);
    return L;
  }
  private void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
  private int findRandom(int range) {
    Random rand = new Random();
    return rand.nextInt(range + 1);
  }
}
