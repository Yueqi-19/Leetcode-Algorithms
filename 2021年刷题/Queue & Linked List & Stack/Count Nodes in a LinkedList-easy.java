/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
public class Solution {
  public int count(ListNode head) {
    ListNode cur = head;
    int i =0;
    while (cur != null){
      i++;
      cur = cur.next;
    }
    return i ;
  }
}
