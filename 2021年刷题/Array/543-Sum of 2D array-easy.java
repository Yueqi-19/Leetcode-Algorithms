public class Solution {
  public int sum(int[][] array) {
   int sum=0;
   //dobouble for loops
    for (int i=0;i<array.length;i++){//rows
     for (int j=0;j<array[0].length;j++){//cols
      sum+= array[i][j];
     } 
    }
   return sum;
  }
}
