package com.interview.datastructures.Tree;

import java.util.ArrayList;
import java.util.List;

public class BoundaryOfBinaryTree {

	List<Integer> res = new ArrayList<>();

	public List<Integer> boundaryOfBinaryTree(TreeNode root) {

		if (root == null)
			return res;

		res.add(root.val);

		processLeftSubTree(root.left);

		processLeafs(root.left);

		processLeafs(root.right);

		processRightSubTree(root.right);

		return res;

	}

	private void processLeafs(TreeNode node) {

		if (node == null)
			return;

		processLeafs(node.left);

		if (node.left == null && node.right == null) {
			res.add(node.val);
		}

		processLeafs(node.right);

	}

	private void processLeftSubTree(TreeNode node) {

		if (node == null)
			return;

		if (node.left != null) {
			res.add(node.val);
			processLeftSubTree(node.left);
		} else if (node.right != null) {
			res.add(node.val);
			processLeftSubTree(node.right);
		}

	}

	private void processRightSubTree(TreeNode node) {
		if (node == null)
			return;

		if (node.right != null) {
			processRightSubTree(node.right);
			res.add(node.val);
		} else if (node.left != null) {
			processRightSubTree(node.left);
			res.add(node.val);
		}
	}
}
