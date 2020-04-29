/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/23
 */

public class thirtynine {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}
	public boolean IsBalanced_Solution(TreeNode root) {
		if(TreeDepth(root)==-1)
			return false;
		else
			return true;
	}
	public int TreeDepth(TreeNode root) {
		if(root==null)
			return 0;
		int left=TreeDepth(root.left);
		int right=TreeDepth(root.right);
		if(left==-1||right==-1)
			return -1;
		if(left-right>1||left-right<-1){
			return -1;
		}
		return left>right?left+1:right+1;
	}

}