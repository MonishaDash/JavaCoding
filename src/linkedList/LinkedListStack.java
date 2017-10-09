package linkedList;

public class LinkedListStack {
	private LinkedList list = new LinkedList();
	
	public void push(int data){
		list.inserAtFirst(data);
	}
	
	public void pop(){
		if(!list.isEmpty()){
		list.deleteHeadNode();
		}
	}
	
	public int peek(){
		return list.showHeadElement();
	}
	
	public int length(){
		return list.length();
	}

}
