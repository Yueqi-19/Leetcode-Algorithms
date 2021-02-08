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
  public boolean isCompleted(TreeNode root) {
    if(root == null){
      return true;
    }
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    boolean flag = true;// 起始状态，我是正常人，没有结扎
    queue.offer(root);
    while(!queue.isEmpty()){
      TreeNode cur = queue.poll();
      if(cur.left == null){//我没有孩子，
        flag = false;//我没有孩子，已经开始结扎了 等同于flag = false
      } else if(flag == false){//隐含条件是我结扎了，但是有孩子
        return false;
      } else{//我有孩子且我没结扎，那我就继续放到queue里面继续跳到下个代码块
        queue.offer(cur.left);
      }
      if(cur.right == null){
        flag = false;
      } else if (flag == false){//隐含条件就是curr。right！= null 且我结扎了，所以判断出轨了return false
        return false;
      } else{// 隐含条件是curr。right ！=null 且我没结扎，所以继续加到queue里面
        queue.offer(cur.right)；
      }
    }
    return true;
  }
}
