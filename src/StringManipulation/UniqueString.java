/**
 * Program to test all the characters in a string are unique
 */
package test;

public class UniqueString {
	public static String str = "abcdefa";
	public static boolean char_arr[] = new boolean[256];
	
	public static boolean isUnique(String str){
		char[] arr = str.toCharArray();
		for(int i=0;i<str.length();i++){
			int val = str.charAt(i);
			if(char_arr[val]){
				//System.out.println("Duplicate");
				return false;
			}
			char_arr[val] = true;
		}
		
		return true;

	}
	public static void main(String[] args) {
		boolean bool = isUnique(str);
		if(bool){
			System.out.println("Unique");
		}else{
			System.out.println("Duplicate");
		}
	}

}
