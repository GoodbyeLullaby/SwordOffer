/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/21
 */

public class thirtysix {
	public class ListNode {
		int val;
		ListNode next = null;
		ListNode(int val) {
			this.val = val;
		}
	}
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		ListNode p=pHead1;
		ListNode q=pHead2;
		while (p!=null&&q!=null){
			p=p.next;
			q=q.next;
		}
		if(p==null){
			while (q!=null){
				q=q.next;
				pHead2=pHead2.next;
			}
		}else {
			while (p!=null){
				p=p.next;
				pHead1=pHead1.next;
			}
		}
		while (pHead1!=null&&pHead2!=null){
			if(pHead1==pHead2)
				return pHead1;
			pHead1=pHead1.next;
			pHead2=pHead2.next;
		}
		return null;
	}
}
