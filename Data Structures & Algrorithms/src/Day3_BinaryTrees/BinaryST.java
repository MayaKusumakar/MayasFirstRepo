package Day3_BinaryTrees;

public class BinaryST {

	// preorder traversal: Root left Right
	// postorder traversal: Left Right Root
	// Inorder traversal: Left Root Right
	static class Node {
		int key;
		Node left;
		Node right;

		Node(int k) {
			key = k;
			left = null;
			right = null;
		}
	}

	public static void main(String[] args) {
		BinaryST bst = new BinaryST();
		bst.insert(9);
		bst.insert(7);
		bst.insert(6);
		bst.insert(8);
		bst.insert(4);
		bst.insert(2);
		bst.insert(9);
		System.out.println(bst.getLeafCount(bst.root));
		bst.attendence(bst.root, 11);
		
		Node t = bst.sibling(bst.root, 6);
		if (t != null)
			System.out.println("sibling is" + t.key);
		else
			System.out.println("there is no sibling");

	}

	Node root;

	public void insert(int key) {
		root = insertRecursion(root, key);
	}

	public Node insertRecursion(Node root, int val) {
		if (root == null) {
			root = new Node(val);
			return root;
		}

		if (val < root.key) {
			root.left = insertRecursion(root.left, val);
		} else if (val > root.key) {
			root.right = insertRecursion(root.right, val);
		}
		return root;
	}

	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println((root.key + " "));
			inOrder(root.right);
		}
	}

	public int getLeafCount(Node node) {
		if (node == null) {
			return 0;
		}
		if (node.left == null && node.right == null) {
			return 1;
		} else {
			return getLeafCount(node.left) + getLeafCount(node.right);
		}
	}

	public void attendence(Node node, int val) {
		if (node == null) {
			System.out.println("absent");
			return;
		}

		if (node.key == val) {
			System.out.println("Present");
			return;
		} else if (val < node.key) {
			attendence(node.left, val);

		} else if (val > node.key) {
			attendence(node.right, val);
		}
	}

	public Node sibling(Node n, int val) {
		Node temp = null;
		if (n == null) {
			return null;
		}
		if (n.left != null && n.right != null) {

			if (n.left.key == val) {
				return n.right;
			} else if (n.right != null && n.right.key == val) {
				return n.left;
			} else {
				temp = sibling(n.left, val);
				if (temp == null)
					temp = sibling(n.right, val);
			}
		}
		return temp;
	}
}
