package sort;

import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] a){
		int N = a.length; // array length
		for (int i = 0; i < N; i++)
		{ // Exchange a[i] with smallest entry in a[i+1...N).
			int min = i; // index of minimal entr.
			for (int j = i+1; j < N; j++)
				if (less(a[j], a[min])) {
					min = j;
				}
			reverse(a, i, min);
		}

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static boolean less(Comparable a, Comparable b){
		return a.compareTo(b) < 0;
	}


	@SuppressWarnings("rawtypes")
	private static void reverse(Comparable[] a, int i ,int j ){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private static void show(Comparable[] a)
	{ // Print the array, on a single line.
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
			//System.out.println();
		}
	}

	public static void main(String[] args) {
		Integer[] a = new Integer[20];
		Random t = new Random();
		for(int i=0 ; i<20 ; i++){
			a[i] = t.nextInt(100);
		}
		System.out.println("Before Sorting");
		show(a);
		sort(a);
		System.out.println("\n");
		System.out.println("After Sorting");
		show(a);

	}

}
