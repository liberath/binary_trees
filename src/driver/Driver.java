package driver;

import java.util.Random;

import tree.BinaryTree;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree t = new BinaryTree();
		Random g = new Random();
		
		for(int i=0; i<1000000;i++){
			t.insert(g.nextInt(10000000)+1);
		}

		System.out.println(t.lookupElement(9837));
		//t.printTree();
	}

}
