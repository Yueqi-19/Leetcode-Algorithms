// convert the 2D array to 1D array and do binary search
public class Solution {
  public int[] search(int[][] matrix, int target) {
    if(matrix.length==0||matrix[0].length==0){
      return new int[] {-1,-1};
    }
    int rows=matrix.length;
    int cols= matrix[0].length;
    int left = 0;
    //convert the 2D array to 1D array with rows*cols elements
    int right = rows*cols-1;
    while(left <= right){
      int mid = left + (right - left)/2;
      // convert the postion in 1d array back to row and col in 2D array.
      int row = mid /cols;
      int col = mid % cols;
      if(matrix[row][col]==target){
        return new int[]{row,col};
      } else if (matrix[row][col] <  target){
        left = mid +1;
      } else {
        right = mid -1;
      }
    }
    return new int[] {-1,-1};
  }
}