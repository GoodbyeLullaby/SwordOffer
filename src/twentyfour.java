import org.junit.Test;

import java.util.ArrayList;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/29
 */

public class twentyfour {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}

	ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		if (root == null)
			return lists;
		ArrayList<Integer> list = new ArrayList<>();
		subFindPath(root, target, list);
		return lists;
	}
	private void subFindPath(TreeNode root, int target, ArrayList<Integer> list) {
		if (target == 0 && root.left == null && root.right == null) {
			lists.add(list);
			return;
		}
		if (target - root.val > 0) {
			list.add(root.val);
			ArrayList<Integer> listLeft = (ArrayList<Integer>) list.clone();
			ArrayList<Integer> listRight = (ArrayList<Integer>) list.clone();

			if (root.left != null) {
				subFindPath(root.left, target - root.val, listLeft);
			}
			if (root.right != null) {
				subFindPath(root.right, target - root.val, listRight);
			}
			list.remove(root.val);
		}
	}
 	@Test
	public void test()
	{
//		TreeNode treeNode=new TreeNode("");
	}
}