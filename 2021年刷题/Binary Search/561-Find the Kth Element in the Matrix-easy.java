// 561. Find the Kth Element in The Matrix
```
Given a matrix, find the Kth index element.



 

example: 

matrix:

1 3 4

5 6 7

8 9 10



k = 4 → return: 6
```
public class Solution {
  public int findElement(int[][] matrix, int k) {
    int i=k/matrix[0].length; //row
    int j=k%matrix[0].length;//columns
    return matrix[i][j];
  }
}
