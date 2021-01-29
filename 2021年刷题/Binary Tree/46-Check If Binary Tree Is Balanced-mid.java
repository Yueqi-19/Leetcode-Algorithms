/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */
public class Solution {
  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }
    if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
      return false;
    }
    return isBalanced(root.right) && isBalanced(root.left);
  }
  private int getHeight(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int L = getHeight(root.left);
    int R = getHeight(root.right);
    return Math.max(L, R) + 1;
  }
}
