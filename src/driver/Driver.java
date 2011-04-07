package driver;

import tree.BinaryTree;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree t = new BinaryTree();
		
		t.printTree();		
		
		t.insert(2);
		t.insert(100);
		t.insert(58);	
		
		
		t.printTree();

	}

}
