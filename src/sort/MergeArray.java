package sort;

public class MergeArray {
	
public static void main(String[] args) {
		
	MergeArray obj = new MergeArray();
	int[] arr1 = {1,2,3,7,8,9,10};
	int[] arr2 = {4,5,6,12};
	int[] result = obj.sort(arr1,arr2);
	
	for(int i: result){
		System.out.println(i);
	}

	}

public int[] sort(int[] a1,int a2[]){

	int[] a3 = new int[a1.length + a2.length];
	int i =0;
	int j =0;
	int k = 0;
	while(i<a1.length && j<a2.length){
		a3[k++] = (a1[i]<a2[j])?a1[i++]:a2[j++];
	}
	while(i<a1.length){
		a3[k++] = a1[i++];
	}
	while(j<a2.length){
		a3[k++] = a2[j++];
	}
	
	return a3;
	
	
}

}
