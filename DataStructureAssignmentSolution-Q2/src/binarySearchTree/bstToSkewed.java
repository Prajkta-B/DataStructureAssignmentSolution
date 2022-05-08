package binarySearchTree;

public class bstToSkewed {
	
	public static class Node{
		int value;
		public Node left, right;
		
		public Node(int val){
			value = val;
			left = right = null;
		}
	}
	
	
	public Node node;
	static Node prevNode = null;
	public static Node head = null;
	
	public static void bstToSkewedTree(Node root) {
		
		if(root == null) {
			return;
		}
		else {
			bstToSkewedTree(root.left);
		}
		
		Node rightNode = root.right;
		
		if(head == null) {
			head = root;
			root.left = null;
			prevNode = root;
		}
		else
        {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
		
		bstToSkewedTree(rightNode);
		
	}
	
	public static void traverseRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.value + " ");
		traverseRightSkewed(root.right);       
	}
}


