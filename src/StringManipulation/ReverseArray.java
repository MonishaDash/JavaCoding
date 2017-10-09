package test;

public class ReverseArray {
	/* Utility that prints out an array on a line */
    static void printArray(int arr[], int size)
    {
        int i;
        for (i=0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
 
    /*Driver function to check for above functions*/
    public static void main (String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        revreseArray(arr, 0, 5);
        System.out.println("Reversed array is ");
        printArray(arr, 6);
    }
    
    public static void revreseArray(int arr[],int start,int end){
    	if(start >= end)
    		return;
    	int temp = arr[start];
    	arr[start] = arr[end];
    	arr[end] = temp;
    	revreseArray(arr,start+1,end-1);
    }
}
