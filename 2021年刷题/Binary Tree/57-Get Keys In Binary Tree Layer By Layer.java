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
  public List<List<Integer>> layerByLayer(TreeNode root){
    List<List<Integer>> list = new ArrayList<List<Integer>>(); //固定的搭配 记住 建容器
    if(root == null){
      return list;
    }
    Queue<TreeNode> queue = new LinkedList<TreeNode>();//记住建容器
    queue.offer(root);
    while(!queue.isEmpty()){
      List<Integer> curLayer = new ArrayList<Integer>();//建容器
      int size = queue.size();
      for(int i = 0; i< size;i++){
        TreeNode cur = queue.poll();
        curLayer.add(cur.key);
        if(cur.left != null){
          queue.offer(cur.left);
        }
        if(cur.right != null){
          queue.offer(cur.right);
        }
      }
      list.add(curLayer);
    }
    return list;
  }
}

//-------------------------------------------------------//
public class Solution {
  public List<List<Integer>> layerByLayer(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      List<Integer> layer = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        TreeNode curr = queue.poll();
        if (curr.left != null) {
          queue.offer(curr.left);
        }
        if (curr.right != null) {
          queue.offer(curr.right);
        }
        layer.add(curr.key);
      }
      res.add(layer);
    }
    return res;
  }
}

