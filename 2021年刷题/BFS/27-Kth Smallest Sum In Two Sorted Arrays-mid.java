public class Solution {
  public class Cell {
    int value;
    int A_index;
    int B_index;
    public Cell(int A_index, int B_index, int value) {
      this.A_index = A_index;
      this.B_index = B_index;
      this.value = value;
    }
  }
  public int kthSum(int[] A, int[] B, int k) {
    PriorityQueue<Cell> min = new PriorityQueue<>(k, new Comparator<Cell>() {
      @Override
      public int compare(Cell a, Cell b) {
        return Integer.compare(a.value, b.value);
      }
    });
    min.offer(new Cell(0, 0, A[0] + B[0]));
    int m = A.length;
    int n = B.length;
    boolean[][] flag = new boolean[m][n];
    flag[0][0] = true;
    for (int i = 0; i < k -1 ; i++) {
      Cell curr = min.poll();
      int row = curr.A_index;
      int column = curr.B_index;
      if (row + 1 < A.length && !flag[row + 1][column]) {
        min.offer(new Cell(row + 1, column, A[row + 1] + B[column]));
        flag[row + 1][column] = true;
      }
      if (column + 1 < B.length && !flag[row][column + 1]) {
        min.offer(new Cell(row, column + 1, A[row] + B[column + 1]));
        flag[row][column + 1] = true;
      }
    }
    return min.peek().value;
  }
}
