/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/26
 */

public class seventeen {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val) {
			this.val = val;
		}
	}
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		if(root1==null||root2==null){
			return false;
		}
		boolean result=false;
		if(root1.val==root2.val){
			result=check(root1, root2);
		}
		if(!result){
			result=HasSubtree(root1.left, root2);
		}
		if(!result){
			return HasSubtree(root1.right,root2);
		}
		return true;
	}
	public boolean check(TreeNode root1,TreeNode root2){
		if(root2==null){
			return true;
		}
		if(root1==null){
			return false;
		}
		if(root1.val!=root2.val){
			return false;
		}
		return check(root1.left, root2.left) && check(root1.right, root2.right);
	}
}
