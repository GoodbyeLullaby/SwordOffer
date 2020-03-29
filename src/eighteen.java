import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/27
 */

public class eighteen {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val) {
			this.val = val;
		}
	}
	public void Mirror(TreeNode root) {
		if(root==null)
			return;
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		Mirror(root.left);
		Mirror(root.right);
	}
	@Test
	public void test(){
		TreeNode tree=new TreeNode(1);
		tree.left=new TreeNode(2);
		tree.right=new TreeNode(3);
		Mirror(tree);
		System.out.println(tree.left.val+" "+tree.right.val);
	}
}
