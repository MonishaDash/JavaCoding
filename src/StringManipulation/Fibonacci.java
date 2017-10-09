package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {
	
	public static Map<Long, Long> cache = new HashMap<>();

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
        System.out.print ("Enter Nmmber: ");
        int max = Integer.parseInt(in.nextLine());
        
//       int a=1,b=1,sum=1;
//       System.out.print(a);
//       System.out.print(" ");
//       System.out.print(b);
//       System.out.print(" ");
//       for(int i =3; i<=max;i++){
//    	   sum = a+b;
//    	   System.out.print(sum);
//    	   System.out.print(" ");
//    	   a =b;
//    	   b = sum;
//       }
       
       
        
        for(int i=1; i<=max; i++){
        	long value = fibonacci(i);
        	System.out.print(value);
        	System.out.print(" ");
        }
	}
	
	public static int fibonacci1(int i){
		if(i == 1 || i == 2){
			return 1;
		}
		
		return(fibonacci1(i-1)+fibonacci1(i-2));
		
	}
	
	public static int fibonacci2(int num){
		if(num == 1 || num == 2){
			return 1;
		}
		
		int fib1 = 1,fib2 = 1,fibFnl = 1;
		
		for(int i = 3; i<=num ; i ++){
			fibFnl = fib1 + fib2 ;
			fib1 = fib2;
			fib2 = fibFnl;
		}
		return fibFnl;
		
	}
	
	public static long fibonacci(int num){
		if(num == 1 || num == 2){
			cache.put(new Long(num), 1L);
			return 1;
		}
		
		Long fib1 =  cache.get(new Long(num-1));
		Long fib2 =  cache.get(new Long(num-2));
		
		Long fibFnl = fib1 + fib2;
		cache.put(new Long(num),fibFnl);
		cache.remove(new Long(num-2));		

		return fibFnl;
		
	}

}
