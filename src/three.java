import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/24
 */

public class three {

	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list=new ArrayList<>();
		while (listNode!=null){
			list.add(listNode.val);
			listNode=listNode.next;
		}
		ArrayList<Integer> results = new ArrayList<>();
		int len=list.size();
		for(int i=len-1;i>=0;i--){
			results.add(list.get(i));
		}
		return results;
	}
}
