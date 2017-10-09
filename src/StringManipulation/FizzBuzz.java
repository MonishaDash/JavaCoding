package test;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
        System.out.print ("Enter NUmber: ");
        String number = in.nextLine();
        int max = Integer.parseInt(number);
        for(int i=0;i<=max;i++){
        	System.out.println(verify(i));
        }

	}

	private static String verify(int i) {
		// TODO Auto-generated method stub
		return (i%3 == 0 ? i%5 == 0 ? "fizzbuzz" : "fizz" : i%5 ==0 ? "buzz" : Integer.toString(i));
		//return(i%15 != 0 ? i%5 != 0 ? i%3 != 0 ? String.valueOf(i) : "Fizz" : "Buzz" : "FizzBuzz");
	}

}
