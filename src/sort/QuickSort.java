package sort;

import java.util.Random;

public class QuickSort {

	//public static Integer[] a = new Integer[7];
	public static Integer[] a = {23,41,0,85,11,72,16};


	@SuppressWarnings("rawtypes")
	public void sort(int low,int high){
		if(low < high){
			int pivotIndex = partition(low,high);
			sort(low,pivotIndex-1);
			sort(pivotIndex+1,high);
		}	
	}
	private int partition(int left,int right){
//		int pivot = a[end];
//		int i = start;
//		for(int j = start;j<=end-1;j++){
//			if(a[j]<pivot){
//				exch(i,j);
//				i++;
//			}
//		}
//		exch(i,end);
//		return i;
		int middle =  (right + left)/2;
		int pivot = a[middle];
		while(left<right){
			while(a[left] < pivot){
				left++;
			}
			while(a[right]>pivot){
				right--;
			}
			if(left <right){
				exch(left,right);
				if(a[left] == a[right]) left++;
			}

		}
//		System.out.println(" ");
//		for (int i = 0; i < a.length; i++){
//			System.out.print(a[i] + " ");
//
//		}
//		System.out.println("pivot index"+ right);
		return right;
	}

	private  void exch(int i,int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;

	}

	private  void show(Comparable[] a)
	{ // Print the array, on a single line.
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");

		}
		//System.out.println();
	}

	public static void main(String[] args) {

		QuickSort obj = new QuickSort();
//		Random t = new Random();
//		for(int i=0 ; i<7 ; i++){
//			a[i] = t.nextInt(100);
//		}
		
		System.out.println("Before Sorting");
		obj.show(a);
		obj.sort(0,a.length-1);
		System.out.println("\n");
		System.out.println("After Sorting");
		obj.show(a);

	}

}
