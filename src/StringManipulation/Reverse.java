package test;

import java.util.Scanner;

public class Reverse {
	public static void main (String [] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.print ("Enter some text, then hit enter: ");
        String text = in.nextLine();
         String strreverse = reverse(text);
         System.out.println(strreverse);
    }

	public static String reverseRecursively(String str) {

        if (str.length() < 2) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
	public static String reverse(String str) {
		char[] arr = str.toCharArray();
		StringBuilder sbr = new StringBuilder();
		for(int i = (arr.length-1);i>=0;i--){
			sbr.append(arr[i]);
		}
        return sbr.toString();

    }

}
