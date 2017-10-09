package test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	
	public static void print(int[] a){
		int length = a.length;
		List<Integer> arr = new ArrayList<Integer>();
		int sum = 0;
		for(int i=0;i<length-1;i++){
			boolean found = false;
			for(int j=i;j<length;j++){
				if(a[j]<a[i]){
					sum = sum + (a[i]-a[j]);
					found = true;
					break;
				}				
			}
			if(!found){
				sum = sum + a[i];
				arr.add(i);
			}

		}
		
		sum = sum+a[length-1];
		
		System.out.print(sum);
		System.out.println("");
		for(int value : arr){
			System.out.print(value);
			System.out.print(" ");
		}
		
	}
	
	public static void main(String[] args){
		int[] a = {5,1,3,4,6,2};
		print(a);
	}

}
