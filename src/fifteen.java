/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/26
 */

public class fifteen {
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
	public ListNode ReverseList(ListNode head) {
		ListNode p=null;
		ListNode q=head;
		ListNode temp;
		while (q!=null){
			temp=q.next;
			q.next=p;
			p=q;
			q=temp;
		}
		return p;
	}

}
