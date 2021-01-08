public class Solution {
  public int minIndex(int[] array, int i) {
    int min = i;
    for(int j =i+1;j<array.length;j++){
      if(array[min]>array[j]){
        min=j;
      }
    }
    return min;
  }
}