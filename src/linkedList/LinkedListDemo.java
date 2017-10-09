package linkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.inserAtFirst(10);
		list.inserAtFirst(14);
//		list.inserAtFirst(20);
//		list.inserAtFirst(15);
//		list.inserAtFirst(30);
//		list.inserAtLast(56);
//		list.inserAtLast(1);
		System.out.println(list);		
		System.out.println("length is: "+ list.length());
		
		list.deleteLastNode();
		System.out.println(list);

//		list.deleteHeadNode();
//		System.out.println("New length is: "+ list.length());
//		System.out.println(list);
//		System.out.println("length is: "+ list.length());
		
//		boolean bool = list.findNode(56);
//		System.out.println("Item Exist :" +bool); 
		
//		list.deleteLastNode();
//		System.out.println(list);	
//		System.out.println("New length is: "+ list.length());
		
//		boolean bool1 = list.deleteRandomNode(56);
//		System.out.println("Item Deleted :" +bool1); 
//		System.out.println(list);

	}

}
