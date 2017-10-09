package demo;

public class LinkedList {
	private Node head;
	
	public void insertLast(int data){
		Node node = new Node(data);
		Node current = this.head;
		if(current == null){
			this.head = node;
			return;
		}
		while(current.getNextNode() != null){
			current = current.getNextNode();	
		}
		current.setNextNode(node);		
	}
	
	public void insertAtFirst(int data){
		Node node = new Node(data);
		node.setNextNode(this.head);
		this.head = node;
		
	}
	
	public int size(){
		Node current = this.head;
		int i = 0;
		if(current == null){
			return i;
		}
		while(current != null){
			i++;
			current = current.getNextNode();
			
		}
		System.out.println("Size is:"+i);
		return i;
	}
	
	public void reverseList(){
		if(size()==0){
			System.out.println("Empty List");
			return;
		}
		Node current = this.head;
		Node tempHead = new Node(current.getData());
		while(current.getNextNode() != null){
			Node node = new Node(current.getNextNode().getData());			
			node.setNextNode(tempHead);
			tempHead = node;	
			current = current.getNextNode();
		}
		this.head = tempHead;
	}
	
	   public void reverse1() {
		   Node current = this.head;
	        Node previous = null;	        
	        Node next = null;
	        while (current != null) {
	        	next = current.getNextNode();
	        	current.setNextNode(previous);
	        	previous = current;
	        	current = next;
	        }
	        this.head = previous;
	    }
	
	public void showData(){
		Node current = this.head;
		 while(current != null){
			 System.out.println(current.getData());
			 current = current.getNextNode();
		 }
	}

}

class Node{
	private int data;
	private Node nextNode;
	
	public Node(){
		
	}
	
	public Node(int data){
		this.data = data;
		this.nextNode = null;
	}	

	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
}