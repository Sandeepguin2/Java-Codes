package DSA.Tree;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}

}

public class BinaryTree {
	Node root;

	public void insert(int data) {
		// TODO Auto-generated method stub
		root = insertRecc(root, data);
	}

	public Node insertRecc(Node root, int data) {
		if (root == null) {
			root = new Node(data);
		} else if (data < root.data) {
			root.left = insertRecc(root.left, data);

		} else if (data > root.data) {
			root.right = insertRecc(root.right, data);

		}
		return root;

	}

	public void inorder() {
		inorderrecc(root);
	}

	public void inorderrecc(Node root) {
		if (root != null) {
			inorderrecc(root.left);
			System.out.print(root.data + " ");
			inorderrecc(root.right);
		}
	}

}
