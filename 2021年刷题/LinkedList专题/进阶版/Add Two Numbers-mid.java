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
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    int value = 0;
    while (l1 != null || l2 != null || value != 0) {
      if (l1 != null) {
        value += l1.value;
        l1 = l1.next;
      }
      if (l2 != null) {
        value += l2.value;
        l2 = l2.next;
      }
      curr.next = new ListNode(value % 10);
      value /= 10;
      curr = curr.next;
    }
    return dummy.next;
  }
}
