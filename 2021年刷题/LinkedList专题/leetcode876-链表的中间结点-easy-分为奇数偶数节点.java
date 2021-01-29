



class Solution {
	public ListNode middleNode(ListNode head) {
		//边界条件不用忘记处理了
		if(head==null || head.next==null) {
			return head;
		}
		//定义慢指针，快指针
		ListNode low = head;
		ListNode fast = head.next;
		while(fast!=null && fast.next!=null) {
			//慢指针每次走一步，快指针每次走两步
			low = low.next;
			fast = fast.next.next;
		}
		//根据快指针是否为空判断边界条件
		if(fast!=null) {
			return low.next;
		}
		return low;
	}
}