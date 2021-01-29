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
  public int countNodes(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = countNodes(root.left);
    int right = countNodes(root.right);
    return countNodes(root.left) + countNodes(root.right) + 1;
  }
}
