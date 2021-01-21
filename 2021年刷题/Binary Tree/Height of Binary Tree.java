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
  public int findHeight(TreeNode root) {
    if(root == null){
      return 0;
  
    }
    int leftHeight = findHeight(root.left);
    int rightHeight = findHeight(root.right);
    return Math.max(findHeight(root.left),findHeight(root.right))+1;
    
  }
}
