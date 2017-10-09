package test;

import java.util.Scanner;

public class Class1 {
	private static Scanner in;
    public static void main(String[] args) {
    	int a=5;
    	int b=6;
    	int c = a<<1;
    	//System.out.println(c);
    	a = a^b;
    	b = a^b;
    	a = a^b;
    	System.out.println(a);
    	System.out.println(b);
//		in = new Scanner(System.in);
//		System.out.print ("Enter some text, then hit enter: ");
//		String str1 = new String(in.nextLine());
//		String str2 = new String(in.nextLine());
//		
//		char[] arr = str1.toCharArray();
//		
//		StringBuilder sbr = new StringBuilder(str2);	
//		
//		for(int i=0;i<str1.length();i++){
//			char c =str1.charAt(i);
//			int index = sbr.indexOf(""+c);
//			if(index >= 0){
//				sbr.deleteCharAt(index);
//			}
//		}
//		
//		System.out.println(sbr.toString());
//		
   }
    
}
