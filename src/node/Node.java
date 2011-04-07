package node;

public class Node {
	private Node left;
	private Node right;
	private int data;
	
	
	public Node(){
		left = null;
		right = null;
		data = 0;
	}
	
	public Node(Node leftIn, Node rightIn, int dataIn){
		left = leftIn;
		right = rightIn;
		data = dataIn;
	}

	
	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
