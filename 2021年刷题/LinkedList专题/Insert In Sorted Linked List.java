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
  public ListNode insert(ListNode head, int value) {
    ListNode newNode = new ListNode(value);
    //1.determine if the inserted node is before head.
    if(head == null || head.value >= value){
      newNode.next = head;
      return newNode;
    }
    //2. insert the new node to the right postion.
    //using the previous node to traverse the linked list
    // the insert postion of the new node should be between prev and prev.next
    ListNode prev = head;
    while (prev.next != null && prev.next.value < value){
      prev = prev.next;
    }
    newNode.next = prev.next;
    prev.next = newNode;
    return head;
  }
}
