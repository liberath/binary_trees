package tree;

import node.Node;

public class BinaryTree {
	private Node root;
	
	public BinaryTree(){
		root = null;
	}
	
	
	/*
	 * insert data recursively with use of a helping recursive function...
	 */
	public void insert(int dataIn){
		insert(root, dataIn);
	}
	
	
	private void insert(Node nodeIn, int dataIn){
		Node insertNode = new Node(null,null,dataIn);
		if(nodeIn == null){
			root = insertNode;
		}else{
			if(dataIn<=nodeIn.getData()){
				if(nodeIn.getLeft() != null){
					insert(nodeIn.getLeft(), dataIn);
				}else{
					nodeIn.setLeft(insertNode);
				}
			}else if(dataIn> nodeIn.getData()){
				if(nodeIn.getRight() != null){
					insert(nodeIn.getRight(),dataIn);
				}else{
					nodeIn.setRight(insertNode);
				}
			}
		}
	}
	
	
	/*prints the tree on a given traversal.*/
	public void printTree(){
		printInOrder(root);
		System.out.println();
	}
	
	
	private void printInOrder(Node nodeIn){

		if (nodeIn != null) {
			printInOrder(nodeIn.getLeft());
			System.out.println(nodeIn.getData());
			printInOrder(nodeIn.getRight());
		}
	}
	
	
	/*search the tree for an element*/
	public boolean searchForElement(int dataIn){
		return searchForElement(root, dataIn);	
	}
	
	private boolean searchForElement(Node nodeIn,int dataIn){
		boolean status = false;
		
		
		return status;
	}
	
	
}//end class
