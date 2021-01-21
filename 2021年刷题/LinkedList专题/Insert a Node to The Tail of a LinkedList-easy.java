public class Solution {
  public ListNode insertNode(ListNode head, int target) {
    ListNode curr = head;
    ListNode newNode = new ListNode(target);
    if(curr == null){
      return newNode;
    }
    while (curr.next != null){
      curr = curr.next;
    }
    curr.next = newNode;
    return head;
  
  }
}