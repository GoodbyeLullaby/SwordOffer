/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/29
 */

public class twentyfive {
	public class RandomListNode {
		int label;
		RandomListNode next = null;
		RandomListNode random = null;

		RandomListNode(int label) {
			this.label = label;
		}
	}
	public RandomListNode Clone(RandomListNode pHead){
		
	}
	public RandomListNode Clone2(RandomListNode pHead){
		RandomListNode currentNode=pHead;
		//将每个节点复制并插入到原节点后面
		while (currentNode!=null){
			RandomListNode cloneNode = new RandomListNode(currentNode.label);
			cloneNode.next=currentNode.next;
			currentNode.next = cloneNode;
			

		}
		currentNode=pHead;
		while (currentNode!=null){
			RandomListNode cloneNode = currentNode.next;
			currentNode.next = cloneNode.next;
			cloneNode.next = cloneNode.next==null?null:cloneNode.next.next;
			currentNode = currentNode.next;

		}
		currentNode=pHead;
		RandomListNode result=pHead.next;
		while (currentNode!=null){
			currentNode.next=pHead.next.next.next;
			currentNode=currentNode.next.next;
		}
		return result;
	}
}
