package linkedList;

public class LinkedListStackDemo {

	public static void main(String[] args) {
		LinkedListStack stack = new LinkedListStack();
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(14);
		System.out.println("stack is: "+ stack.length());
		
		System.out.println(stack.peek());
		
		stack.pop();
		System.out.println("stack is: "+ stack.length());
		
		System.out.println(stack.peek());

	}

}
