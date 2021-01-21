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
  public ListNode partition(ListNode head, int target) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode S = new ListNode(0);
    ListNode L = new ListNode(0);
    ListNode curr1 = S;
    ListNode curr2 = L;
    while (head != null) {
      if (head.value < target) {
        curr1.next = head;
        head = head.next;
        curr1 = curr1.next;
      } else {
        curr2.next = head;
        head = head.next;
        curr2 = curr2.next;
      }
    }
    curr1.next = L.next;
    curr2.next = null;
    return S.next;
  }
}
