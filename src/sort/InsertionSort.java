package sort;

import java.util.Random;

public class InsertionSort {
	@SuppressWarnings("rawtypes")
	public static void insertionSort(Comparable[] a){
		for(int i=1; i<a.length; i++){
			for(int j = i ; j>0 ; j--) {
				if(less(a[j],a[j-1])){
					reverse(a,j,j-1);
				} else{
					break;
				}
			}
		}
		
	}
	

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
			System.out.print(a[i] + ", ");
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
        insertionSort(a);
        System.out.println("\n");
        System.out.println("After Sorting");
       show(a);

	}


}
