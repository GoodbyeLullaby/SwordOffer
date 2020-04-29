/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/31
 */

public class twentysix {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}
	public TreeNode pre;
	public TreeNode head;
	//无限左
	public TreeNode Convert(TreeNode pRootOfTree) {
		if(pRootOfTree==null)
			return null;
		Convert(pRootOfTree.left);
		pRootOfTree.left=pre;
		if(pre==null){
			head=pRootOfTree;
		}else {
			pre.right=pRootOfTree;
		}
		pre=pRootOfTree;
		Convert(pRootOfTree.right);
		return head;
	}
	public TreeNode front;
	//无限右
	public TreeNode Convert2(TreeNode pRootOfTree) {
		if(pRootOfTree==null)
			return null;
		Convert(pRootOfTree.right);
		if(front==null){
			front=pRootOfTree;
		}else {
			pRootOfTree.right=pre;
			pre.left=pRootOfTree;
			pre=pRootOfTree;
		}
		Convert(pRootOfTree.left);
		return front;
	}
}
