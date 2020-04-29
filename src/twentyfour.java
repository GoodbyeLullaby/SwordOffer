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
		if (target == root.val && root.left == null && root.right == null) {
			list.add(root.val);
			boolean sb=true;
			for(int i=0;i<lists.size();i++){
				if(lists.get(i).size()<list.size()){
					lists.add(i,list);
					sb=false;
				}
			}
			if(sb)
				lists.add(list);
			return;
		}
		if (target - root.val >0) {
			list.add(root.val);
			ArrayList<Integer> listLeft = (ArrayList<Integer>) list.clone();
			ArrayList<Integer> listRight = (ArrayList<Integer>) list.clone();
			list=null;
			if (root.left != null) {
				subFindPath(root.left, target - root.val, listLeft);
			}
			if (root.right != null) {
				subFindPath(root.right, target - root.val, listRight);
			}
		}
	}
 	@Test
	public void test(){
		TreeNode treeNode=new TreeNode(10);
		treeNode.right=new TreeNode(12);
		treeNode.left=new TreeNode(5);
		treeNode.left.left=new TreeNode(4);
		treeNode.left.right=new TreeNode(7);
		System.out.println(FindPath(treeNode, 22));

	}
}