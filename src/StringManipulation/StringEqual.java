package test;

import java.util.Scanner;

public class StringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print ("Enter 2 string: ");
		String string1 = new String(in.nextLine());
		String string2 = new String(in.nextLine());
		System.out.println("String1 : "+string1);
		System.out.println("String2 : "+string2);
		boolean bool = isPermutation(string1,string2);
		if(bool){
			System.out.println("Both Strings are permutation");
		}else{
			System.out.println("Sorry!Both Strings are not permutation");
		}

	}

	public static boolean isPermutation(String str1, String str2){
		if(sort(str1).equals(sort(str2))){
			return true;
		}
		return false;
	}
	public static String sort(String str){
		char[] arr =str.toLowerCase().toCharArray();
		java.util.Arrays.sort(arr);
		String strReturn = new String(arr);
		return strReturn;
	}
}
