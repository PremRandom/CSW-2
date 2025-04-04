package checkIfBST;










class Node{
	int key;
	Node left, right;
	public Node(int item) {
		this.key = item;
		left = right = null;
	}
}




class BinaryTree{
	Node root;
	public BinaryTree() {
		root = null;
	}
	
	Node insert(Node root, int key) {
		if(root == null) {
			return new Node(key);
		}
		if(key<root.key) {
			root.left = insert(root.left, key);
		}
		else if(key> root.key) {
			root.right = insert(root.right, key);
		}
		
		return root;
	}
	
	void insert(int key) {
		root = insert(root, key);
	}
	
	boolean isBST(Node node, int min, int max) {
		if(node==null) {
			return true;
		}
		if(node.key<= min || node.key>=max) {
			return false;
		}
		return isBST(node.left, min, node.key) && isBST(node.right,  node.key, max);
	}
	boolean isBST() {
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
}

















public class CheckIfBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree1 = new BinaryTree();
		tree1.root = new Node(50);
		tree1.root.left = new Node(30);
		tree1.root.right = new Node(70);
		tree1.root.left.left = new Node(20);
		tree1.root.left.right = new Node(40);
		tree1.root.right.left = new Node(60);
		tree1.root.right.right = new Node(80);
		
		
		System.out.println("Is tree1 a BST? "+ tree1.isBST());
		
		BinaryTree tree2 = new BinaryTree();
		tree2.root = new Node(50);
		tree2.root.left = new Node(30);
		tree2.root.right = new Node(70);
		tree2.root.left.left = new Node(20);
		tree2.root.left.right = new Node(60);
		tree2.root.right.left = new Node(40);
		tree2.root.right.right = new Node(80);
		
		
		System.out.println("Is tree2 a BST? "+ tree2.isBST());


	}

}
