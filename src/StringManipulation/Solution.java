package test;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		//System.out.print ("Enter String: ");
		//String tweetString = scanner.nextLine();
		Integer num = new Integer(78);
		System.out.println("Input number:" + num);
		Solution.add(num);
		//System.out.println(Math.round((3+6)/2));
	}
	
	public static int add(Integer num){
		String str = num.toString();
		char[] arr = str.toCharArray();
		int[] arrInt = new int[arr.length-1];
		for(int i=0;i<arr.length-1;i++){	
			StringBuffer sfr = new StringBuffer();
			int a = Math.round((Character.getNumericValue(arr[i]) + Character.getNumericValue(arr[i+1]))/2);
			sfr.append(str.substring(0, i<0?0:i));
			sfr.append(a);	
			sfr.append(str.substring(i+2,arr.length));
			Integer value = new Integer(sfr.toString());
			System.out.println(value);
			arrInt[i] = value;
		}
		
		Arrays.sort(arrInt);
		System.out.println("Max value is:"+ arrInt[arr.length-2]);

		return 0;
	}

}
