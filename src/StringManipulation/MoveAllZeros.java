package test;

import java.util.Arrays;

public class MoveAllZeros {

	public static void main(String[] args) {
		int a[] = { 1, 0, 0, 0, 0, 3, 2, 0, 4, 5, 0 };
		System.out.println(Arrays.toString(a));
		int cnt = 0;
		
		for(int i=0;i<a.length;i++){
			if(a[i] != 0){
				a[cnt++] =  a[i];
			}
		}
		for(int i=cnt;i<a.length;i++){
			a[i] = 0;
		}
		System.out.println(Arrays.toString(a));

	}

}
