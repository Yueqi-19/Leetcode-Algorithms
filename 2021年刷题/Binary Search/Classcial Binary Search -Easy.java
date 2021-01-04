public class Solution {
  public int binarySearch(int[] array, int target) {
    if (array==null||array.length==0){
      return -1;
    }
    int left = 0;
    int right = array.length -1;
	
    while( left <= right){ //注意边界条件， 这边是 left小于等于right
      int mid = left + (right - left)/2;
      if (array[mid]==target){
        return mid;
      } else if (array[mid]<target){
        left = mid +1;
      } else {
        right = mid -1;
      }
    }
    return -1;
  }

}