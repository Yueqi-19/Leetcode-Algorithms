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
  public ListNode merge(ListNode one, ListNode two) {
    if(one == null) {
      return two;
    }
    if (two == null) {
      return one;
    }
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    while (one != null && two != null) {
      if (one.value < two.value) {
        curr.next = one;
        one = one.next;
        curr = curr.next;
      } else {
        curr.next = two;
        two = two.next;
        curr = curr.next;
      }
    }
    if (one != null) {
      curr.next = one;
    } else {
      curr.next = two;
    }
    return dummy.next;
  }
}
