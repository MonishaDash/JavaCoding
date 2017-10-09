package test;

import java.util.Scanner;

public class Reverse1 {

	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		 System.out.print ("Enter some text, then hit enter: ");
		 String strOriginal = new String(in.nextLine());
		 System.out.println("Original String : "+strOriginal);

		 int l = strOriginal.length();
		
		 char[] charArrTemp = strOriginal.toCharArray();
		 //char[] charArrRev = new char[l];
		 
		 int i = 0;
		 int j = l-1;
		 char c;
		 
		 while(i<=j){
			 if(isVowel(charArrTemp[i])){
				 i++;
			 }
			 else if(isVowel(charArrTemp[j])){
				 j--;
			 }
			 else{
				 c = charArrTemp[i];
				 charArrTemp[i] = charArrTemp[j];
				 charArrTemp[j] = c;				 
				 i++;
				 j--;				 
			 }
			 
		 }
		 System.out.println("After Reverse : " + new String(charArrTemp));



	}
	public static boolean isVowel(char c){
		if("AEIOUaeiou".indexOf(c) < 0)
			return false;
		return true;
	}

}
