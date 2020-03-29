import org.junit.Test;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/24
 */

public class four {


	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if(pre.length==0||in==null){
			return null;
		}
		return buildTree(pre,in,0,pre.length-1,0,in.length-1);
	}

	public TreeNode buildTree(int[] pre, int[] in,int preStart,int preEnd,int inStart,int inEnd) {
		TreeNode treeNode=new TreeNode(pre[preStart]);
		int posIn=find(pre[preStart],in,inStart,inEnd);
		int lenLeft=posIn-inStart;
		int lenRight=inEnd-posIn;
		if(lenLeft>0)
			treeNode.left=buildTree(pre, in,preStart+1,preStart+lenLeft,inStart,posIn-1 );
		if(lenRight>0)
			treeNode.right=buildTree(pre, in,preEnd-lenRight+1,preEnd,posIn+1,inEnd );
		return treeNode;
	}

	public int find(int target, int[] in, int p, int q) {
		while(p<=q){
//			System.out.println(p);
			if(in[p]==target){
				return p;
			}
			p++;
		}
		return -1;
	}
	@Test
	public void test(){
		int pre[]={1,2,4,7,3,5,6,8};
		int in[]={4,7,2,1,5,3,8,6};
		TreeNode treeNode = reConstructBinaryTree(pre, in);
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(treeNode);
		while (queue.size()>0){
			TreeNode poll = queue.poll();
			System.out.print(poll.val+" ");
			if(poll.left!=null)
				queue.add(poll.left);
			if(poll.right!=null)
				queue.add(poll.right);
		}
	}

}
