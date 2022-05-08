package skewedTreeMain;

import binarySearchTree.bstToSkewed;
import binarySearchTree.bstToSkewed.Node;

public class Driver {

	public static void main(String[] args) {
		
		bstToSkewed obj = new bstToSkewed();
		obj.node = new Node(50);
		obj.node.left = new Node(30);
		obj.node.right = new Node(60);
		obj.node.left.left = new Node(10);
		obj.node.right.left= new Node(55);
		
		bstToSkewed.bstToSkewedTree(obj.node);
        bstToSkewed.traverseRightSkewed(bstToSkewed.head);

	}

}
