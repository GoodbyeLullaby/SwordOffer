import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/26
 */

public class sixteen {
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
	public ListNode Merge(ListNode list1,ListNode list2) {
		if(list1==null){
			return list2;
		}
		if(list2==null){
			return list1;
		}
		ListNode res,head;
		if(list1.val<list2.val){
			res=list1;
			head=list1;
			list1=list1.next;
		}else {
			res=list2;
			head=list2;
			list2=list2.next;
		}

		while (list1!=null&&list2!=null){
			if(list1.val<list2.val){
				head.next=list1;
				list1=list1.next;
			}else {
				head.next=list2;
				list2=list2.next;
			}
			head=head.next;
		}

		if (list1!=null){
			head.next=list1;
		}
		if (list2!=null){
			head.next=list2;
		}

		return res;
	}
	@Test
	public void test(){
		ListNode list1=new ListNode(1);
		list1.next=new ListNode(3);
		list1.next.next=new ListNode(10);
		list1.next.next.next=new ListNode(20);

		ListNode list2=new ListNode(4);
		list2.next=new ListNode(5);
		list2.next.next=new ListNode(6);
		list2.next.next.next=new ListNode(7);

		ListNode r=Merge(list1, list2);


	}
}
