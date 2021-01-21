public class Solution {
  public ListNode insertNode(ListNode head, int target) {
    ListNode curr = head;
    ListNode newHead = new ListNode (target);
    while (curr.next != null){
      if(target >= curr.value && target <= curr.next.value){
        ListNode temp = curr.next;
        curr.next = newHead;
        newHead.next = temp;
        return head;
      }
      curr = curr.next; 
    }
    return head; 
  }
}