package linkedList;

public class LinkedList {

	private Node head;

	public void inserAtFirst(int data){
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;

	}

	public void inserAtLast(int data){
		Node headNode = this.head;
		if(headNode == null){
			Node newNode = new Node(data);
			//newNode.setNextNode(null);
			this.head = newNode;
			return;
		}
		while(headNode.getNextNode() != null){
			headNode = headNode.getNextNode();
		}
		Node newNode = new Node(data);
		//newNode.setNextNode(null);
		headNode.setNextNode(newNode);

	}

	public void deleteHeadNode(){
		if(this.head == null){
			return;
		}
		this.head = this.head.getNextNode();
	}

	public void deleteLastNode(){
		//		Node headNode = this.head;
		//		//System.out.println(headNode.getData());
		//		Node lastNode = headNode;
		//		 while(lastNode.getNextNode() != null){
		//			lastNode = lastNode.getNextNode();
		//		 }
		//		
		//		Node previousLast = headNode;
		//		
		//		while(previousLast.getNextNode() != lastNode){
		//			previousLast = previousLast.getNextNode();
		//		}
		//		lastNode = previousLast;
		//		lastNode.setNextNode(null);

		Node headNode = this.head;
		if(headNode == null || headNode.getNextNode() == null){
			this.head  = null;
			return;
		}
		Node previousLast = headNode;
		Node lastNode = previousLast.getNextNode();
		while(lastNode.getNextNode() != null){			
			previousLast = lastNode;
			lastNode = lastNode.getNextNode();
		}

		previousLast.setNextNode(null);


	}

	public boolean deleteRandomNode(int data){
		Node headNode = this.head;
		if(headNode == null){
			return false;
		}else{
			Node previousNode = headNode;
			Node dataNode = previousNode.getNextNode();
			if(previousNode.getData() == data){
				this.head = dataNode;
				return true;
			}else{
				while(dataNode != null){
					if(dataNode.getData() == data){
						previousNode.setNextNode(dataNode.getNextNode());
						return true;
					}
					previousNode = dataNode;
					dataNode = dataNode.getNextNode();
				}
				return false;
			}

		}

	}

	public boolean findNode(int data){
		Node newNode = this.head;
		while(newNode != null){
			if(newNode.getData() == data){
				return true;
			}

			newNode = newNode.getNextNode();
		}

		return false;
	}

	public int length(){
		int length = 0;
		Node current = this.head;
		while(current != null){
			length++;
			current = current.getNextNode();
		}
		return length;
	}

	public boolean isEmpty(){
		return(this.head == null);
	}

	public int showHeadElement(){
		if(this.head == null){
			return 0;
		} else{
			return this.head.getData();
		}
	}

	@Override
	public String toString(){
		String result = "{";
		Node current = this.head;

		while(current != null){
			result += current.toString() + ",";
			current = current.getNextNode();
		}

		result += "}";

		return result;

	}

}
