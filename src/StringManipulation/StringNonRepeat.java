package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringNonRepeat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String:");
		String input = scanner.nextLine();
		StringNonRepeat.findNonRepeat(input);
	}
	
	public static void findNonRepeat(String input){
		Map<Character,Integer> myMap = new HashMap<>();
		Character c;
		boolean flag = false;
		for(int i=0;i<input.length();i++){
			c = input.charAt(i);
			if(myMap.containsKey(c)){
				myMap.put(c,myMap.get(c)+1);
			}else{
				myMap.put(c,1);
			}
		}
		
		for(int i=0;i<input.length();i++){
			c = input.charAt(i);
			if(myMap.get(c) ==1){
				System.out.println(c);
				flag=true;
				//return;
			}
		}
		if(!flag){
		System.out.println("No Unique character");
		}
		
	}

}
