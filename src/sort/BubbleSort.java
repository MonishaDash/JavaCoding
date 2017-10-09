package sort;

import java.util.Random;

public class BubbleSort {
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] a){
		int N = a.length; // array length
		for (int i = N-1; i > 0; i--)
		{ 
			for (int j = 0; j < i; j++)
				if (less(a[j+1], a[j])) {
					reverse(a, j, j+1);
				}
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
