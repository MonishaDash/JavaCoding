package test;

public class CommonElementsInSortedArrays {

	public static void main(String[] args) {
		   int a[] = { 1, 3, 4, 5, 7 };
	        int b[] = { 2, 3, 5, 6 };	 
	        commonEleemntsInArray(a, b);

	}
	
	public static void commonEleemntsInArray(int[] a,int[] b){
		int lenA = a.length;
		int lenB = b.length;
		int i = 0;
		int j = 0;
		while(i<lenA && j<lenB){
			if(a[i]< b[j]){
				i++;
			}else if(b[j]<a[i]){
				j++;
			}else{
				System.out.println(a[i]);
				i++;
				j++;
			}
		}
	}

}
