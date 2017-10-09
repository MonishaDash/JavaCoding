/**
 * Write a method to replace all spaces in a string with '%20'.
 */
package test;

public class StringReplace {
	public static String str = "abc de fa ";
	public static boolean char_arr[] = new boolean[256];
	
	public static String stringReplace(String str){
		StringBuilder sbr = new StringBuilder();
		char char_arr[]  = str.toCharArray();
		for(int i=0;i<char_arr.length;i++){
			if(char_arr[i] == ' '){
				sbr.append("%20");
			}else{
				sbr.append(char_arr[i]);
			}
		}
		return sbr.toString();

	}
	public static void main(String[] args) {
		String str1 = stringReplace(str);
		System.out.println(str1);
	}

}
