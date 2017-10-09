
package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StairCase {
	
	public static Map<Integer,Long> map = new HashMap<Integer,Long>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of steps in staircase:");
		String input = scanner.nextLine();
		Long steps = findSteps(Integer.parseInt(input));
		System.out.println("Total number of ways :" + steps);

	}
	
	public static Long findSteps(int input){
		if(map.containsKey(input)){
			return map.get(input);
		}else if(input <0){
			return new Long(0);
		} else if(input == 0){
			return 1L;
		}else{
			map.put(input, findSteps(input-1) + findSteps(input-2) + findSteps(input-3));
			return map.get(input);
		}
	}

}
