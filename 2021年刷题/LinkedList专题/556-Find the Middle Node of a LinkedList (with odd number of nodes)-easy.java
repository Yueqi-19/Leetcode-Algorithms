public class Solution {
  public ListNode findMiddleNode(ListNode head) {
    if (head == null || head.next ==null){
      return head;
    }
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow; //针对奇数节点中间值的情况，slow 节点会落在中间点上
  }
}