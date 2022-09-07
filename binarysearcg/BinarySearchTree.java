package com.binarysearcg;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BinarySearchTree {

	static Set<Node> set = new HashSet<>();
	static Stack<Node> stack = new Stack<>();

	// Function to build tree using given traversal
	public Node buildTree(int[] preorder, int[] inorder) {

		Node root = null;
		for (int pre = 0, in = 0; pre < preorder.length;) {

			Node node = null;
			do {
				node = new Node(preorder[pre]);
				if (root == null) {
					root = node;
				}
				if (!stack.isEmpty()) {
					if (set.contains(stack.peek())) {
						set.remove(stack.peek());
						stack.pop().right = node;
					} else {
						stack.peek().left = node;
					}
				}
				stack.push(node);
			} while (preorder[pre++] != inorder[in] && pre < preorder.length);

			node = null;
			while (!stack.isEmpty() && in < inorder.length && stack.peek().val == inorder[in]) {
				node = stack.pop();
				in++;
			}

			if (node != null) {
				set.add(node);
				stack.push(node);
			}
		}

		return root;
	}

	// Function to print tree in Inorder
	void printInorder(Node node) {
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		/* then print the data of node */
		System.out.print(node.val + " ");

		/* now recur on right child */
		printInorder(node.right);
	}

	// driver program to test above functions
	public static void main(String args[]) {
		BinarySearchTree tree = new BinarySearchTree();

		int in[] = new int[] { 9, 8, 4, 2, 10, 5, 10, 1, 6, 3, 13, 12, 7 };
		int pre[] = new int[] { 1, 2, 4, 8, 9, 5, 10, 10, 3, 6, 7, 12, 13 };
		int len = in.length;

		Node root = tree.buildTree(pre, in);

		tree.printInorder(root);
	}

	/*
	 * static Node root;
	 * 
	 * Node sortedArrayToBST(int arr[], int start, int end) {
	 * 
	 * if (start > end) { return null; }
	 * 
	 * int mid = (start + end) / 2; Node node = new Node(arr[mid]);
	 * 
	 * node.left = sortedArrayToBST(arr, start, mid - 1);
	 * 
	 * node.right = sortedArrayToBST(arr, mid + 1, end);
	 * 
	 * return node; } void preOrder(Node node) { if (node == null) { return; }
	 * System.out.print(node.data + " "); preOrder(node.left); preOrder(node.right);
	 * }
	 * 
	 * public static void main(String[] args) { BinarySearchTree tree = new
	 * BinarySearchTree(); int arr[] = new int[] { 1,2, 3, 4, 5, 6, 7 };
	 * System.out.println("Inorder traversal of constructed BST");
	 * 
	 * for (int i = 0; i < arr.length; i++) { System.out.print(arr[i]+" "); } int n
	 * = arr.length; root = tree.sortedArrayToBST(arr, 0, n - 1);
	 * System.out.println();
	 * System.out.println("Preorder traversal of constructed BST");
	 * tree.preOrder(root); }
	 */
}
