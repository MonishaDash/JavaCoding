package test;

import java.util.*;

public class BalancedParanthesis {
	private static Map<Character,Character> obj = new HashMap<Character,Character>();
	private static Stack<Character> stack = new Stack<Character>();
	static{
		obj.put('{', '}');
		obj.put('[', ']');
		obj.put('(', ')');
	}
	public static boolean isBalanced(String str){
		if((null == str) || (str.length() == 0)){
			return false;
		}
		//final Stack<Character> stack = new Stack<Character>();
		//Deque<Character> stack = new ArrayDeque<Character>();
		int length = str.length();
		for(int i =0;i<length;i++){
			char c = str.charAt(i);
			if(isParenthesis(c)){				
				if(obj.containsKey(c)){
					stack.push(str.charAt(i));
				}else if((stack.size() == 0) || (c != obj.get(stack.pop()))){
					return false;				
				}
			}
		}	

		if(stack.size() == 0)		
			return true;

		return false;

	}

	public static boolean isParenthesis(char c){
		if("{}[]()".indexOf(c) < 0)
			return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print ("Enter some text, then hit enter: ");
		String text = in.nextLine();
		boolean b = isBalanced(text);
		System.out.println(b);

	}

}
