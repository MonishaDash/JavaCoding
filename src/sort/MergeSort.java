package sort;

import java.util.Random;

public class MergeSort {
	
	public static Integer[] a = new Integer[9];
	public static Integer[] aux = new Integer[9];
	
	
	@SuppressWarnings("rawtypes")
	public void sort(int low,int high){
		int mid = (low+high)/2;
		if(low<high){
			sort(low,mid);
			sort(mid+1,high);
			merge(low,mid,high);
		}

	}
	
	public void merge(int low,int middle,int high){
		//System.out.println("in merge");
		
		for(int i=low;i<=high;i++){
			aux[i] = a[i];
			//System.out.print(aux[i]);
			//System.out.print(" ");
		}
		//System.out.println();
		int i = low;
		int j = middle+1;
		int k = low;
		while(i<=middle && j <= high){
			if(aux[i]<=	aux[j]){
				a[k++] = aux[i++];
			} else{
				a[k++] = aux[j++];
			}
		}
		
		while(i <= middle){
			a[k++] = aux[i++];
		}
	}


	private  void show(Comparable[] a)
	{ // Print the array, on a single line.
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
			
		}
		//System.out.println();
	}

	public static void main(String[] args) {
		
		MergeSort obj = new MergeSort();
		Random t = new Random();
		for(int i=0 ; i<9 ; i++){
			a[i] = t.nextInt(100);
		}
		//Integer[] a = {25, 34, 36, 98, 25, 25, 95, 17, 22, 98, 92, 61, 12, 68, 64, 47, 31, 1, 61, 49};
		System.out.println("Before Sorting");
		obj.show(a);
		obj.sort(0,a.length-1);
		System.out.println("\n");
		System.out.println("After Sorting");
		obj.show(a);

	}

}
