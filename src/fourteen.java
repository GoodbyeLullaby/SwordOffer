/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/26
 */

public class fourteen {
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
	public ListNode FindKthToTail(ListNode head,int k) {
		if(k==0)
			return null;
		ListNode front=head;
		ListNode end=head;
		for(int i=1;i<k&&end!=null;i++){
			end=end.next;
		}
		if(end==null)
			return null;
		while (end.next!=null){
			end=end.next;
			front=front.next;
		}
		return front;
	}
}
