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
	  //新建一个list 放入小list
    List<List<Integer>> list = new ArrayList<List<Integer>>();//用的ArrayList
    if(root == null){
      return list;
    }  
	//然后新建一个队列 初始化
    Queue<TreeNode> queue = new LinkedL<TreeNode>();// queue是一个接口，只提要求。可以用LinkedList 实现，也可以用ArrayDeque
    //将根节点放入队列中，然后不断遍历队列
	queue.offer(root);
    while(!queue.isEmpty()){
		//新建一个层数初始化，容器初始化
      List<Integer> curLayer = new ArrayList<Integer>();
	  //初始化尺寸,获取当前队列的长度，这个长度相当于 当前这一层的节点个数
      int size = queue.size();
	 
      for(int i = 0; i< size;i++){
	// 开始节点的吐出, 并把值加入到新的一层
        TreeNode cur = queue.poll();
        curLayer.add(cur.key);
        if(cur.left != null){
          queue.offer(cur.left);
        }
        if(cur.right != null){
          queue.offer(cur.right);
        }
      }
	  //将临时list加入最终返回结果中
      list.add(curLayer);
    }
    return list;
  }
}
