import org.junit.Test;

import java.util.ArrayList;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/28
 */

public class twentytwo {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

		public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
			ArrayList<TreeNode> queue = new ArrayList<>();
			ArrayList<Integer> result = new ArrayList<>();
			if (root == null)
				return result;
			queue.add(root);
			while (queue.size() > 0) {
				root = queue.remove(0);
				result.add(root.val);
				if (root.left != null)
					queue.add(root.left);
				if (root.right != null)
					queue.add(root.right);
			}
			return result;
		}
	}
}
