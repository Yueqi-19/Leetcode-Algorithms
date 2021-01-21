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
  public List<Integer> inOrder(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    helper(root,res);
    return res;
  }
  private void helper(TreeNode root ,List<Integer> res){
    if (root == null){
      return;
    }
    helper(root.left,res);
    res.add(root.key);
    helper(root.right,res);
  }
}

