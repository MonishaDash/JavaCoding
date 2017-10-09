package test;

public class ArrayElementSearch {
	public static Integer[] arr={1,5,4,3,8,10,78,12,24,26,26,78};
	public ArrayElementSearch(){
		
	}
	
	public void findElement(int k){
		if(k<1 || k>arr.length){
			System.out.println("Invalid Index");
			return;
		}
		sort(0,arr.length-1,k-1);
	}
	
	public void sort(int low,int high,int index){
		int pivot = partition(low,high);
		while(low<high){			
			if(pivot == index){
				System.out.println(arr[pivot]);
				return;
			}
			else if(pivot>index){
				low = 0;
				high = pivot-1;
				pivot = partition(low,high);
			}
			else{
				low = pivot+1;
				pivot = partition(low,high);
			}

		}
	}
	
	public int partition(int start,int end){
		int pivot = arr[end];
		int i = start;
		int j = end;
		while(i<j){
			while(i<=j && arr[i]> pivot) i++;
			while(i<=j && arr[j]<pivot) j--;
			if(i <j ){
				exch(i,j);
				if(arr[i] == arr[j]){
					i++;
				}
			}
		}
		
		return i;
	}
	
	private  void exch(int i,int j){		
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;

	}

	public static void main(String[] args) {
		
		ArrayElementSearch obj = new ArrayElementSearch();
		obj.findElement(2);
		System.out.println("After Sorting");
		
		for(int i : arr){
			System.out.print(i);
			System.out.print(" ");
		}

	}

}
