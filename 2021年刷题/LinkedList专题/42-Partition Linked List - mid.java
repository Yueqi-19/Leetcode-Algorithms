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
    if(head== null){
      return null; 
    }
    ListNode fakeHeadSmall = new ListNode(0);
    ListNode fakeHeadLarge = new ListNode(0);
    ListNode smallCurr = fakeHeadSmall;
    ListNode largeCurr = fakeHeadLarge;
    ListNode current = head;
    while(current != null){
      if(current.value < target){
        smallCurr.next = current;
        smallCurr= current;
      } else {
        largeCurr.next = current;
        largeCurr = current;
      }
      current = current.next;
    }
    largeCurr.next = null;
    smallCurr.next = fakeHeadLarge.next;
    return fakeHeadSmall.next;
  }
}
         