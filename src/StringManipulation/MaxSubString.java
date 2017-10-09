package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class MaxSubString {
	private static Scanner in;
	private static HashSet<Character> arr = new HashSet<Character>();
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.print ("Enter some text, then hit enter: ");
		String strOriginal = new String(in.nextLine());
		System.out.println("Original String : "+strOriginal);
		
		boolean bool = isStringUnique(strOriginal);
		if(bool){
			System.out.println("String is unique");
		}else{
			System.out.println("String is not unique");
		}
		
		int size = lengthOfLongestSubstring(strOriginal);
		System.out.println("Length of Max sub Array is : "+size);

	}
	
//	public static int MaxLengthString(String s){
//		int start=0;
//		String strMax;
//		int max = 0;
//		for(int i=0;i<s.length();i++){
//			char c = s.charAt(i);
//			if(!arr.contains(c)){
//				arr.add(c);
//				max = Math.max(max, )
//			}else{
//				max = Math.max(max, arr.size());
//				//strMax = s.substring(start, start+arr.size());
//				for(int j=start;j<i;j++){
//					if(s.charAt(j) != c){
//						arr.remove(s.charAt(j));						
//					}else{
//						start = j+1;
//						break;
//					}
//				}
//			}
//			
//		}
//		
//	}
	
	
	public static int lengthOfLongestSubstring(String s){
		if((s == null) || (s.length() ==0)){
			return 0;
		}
		//int start;
		int max = 0;
		String max_string = "";
		int length = s.length();
		for(int i=0;i<length;i++){
			//start = i;
			String current = ""+s.charAt(i);
			for(int j=i+1;j<length;j++){
				if(current.indexOf(s.charAt(j))<0){
					current = current+ s.charAt(j);
				}else{
					int current_length = j-i;
					if(current_length>max){
						max = current_length;
						max_string = current;
					}
					break;
				}
				if(j == length-1){
					int current_length = j-i+1;
					if(current_length>max){
						max = current_length;
						max_string = current;
				}
				}
			}
		}
		System.out.println("Max Substring is: "+ max_string);
		//System.out.println(max);
		return max;
	}
	
	
	public static boolean isStringUnique(String s){
		
		boolean flag[] = new boolean[256];
		
		for(int i=0;i<s.length();i++){
			if(flag[s.charAt(i)]){
				return false;
			}
			else{
				flag[s.charAt(i)] = true;
			}
		}
		return true;
	}
	
	
	
/*
	public static int lengthOfLongestSubstring(String s) {
		if(s==null)
			return 0;
		boolean[] flag = new boolean[256];

		int result = 0;
		int start = 0;
		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			char current = arr[i];
			if (flag[current]) {
				result = Math.max(result, i - start);
				// the loop update the new start pointboolean 
				// and reset flag array
				// for example, abccab, when it comes to 2nd c,
				// it update start from 0 to 3, reset flag for a,b
				for (int k = start; k < i; k++) {
					if (arr[k] == current) {
						start = k + 1; 
						break;
					}
					flag[arr[k]] = false;
				}
			} else {
				flag[current] = true;
			}
		}

		result = Math.max(arr.length - start, result);

		return result;
	}*/

}
