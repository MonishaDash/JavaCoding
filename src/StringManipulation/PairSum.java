package test;

import java.util.HashMap;
import java.util.Map;

class PairSum
{
    private static final int MAX = 1000; // Max size of Hashmap
    
    private static Map<Integer,Boolean> map = new HashMap<Integer,Boolean>();
 
    static void printpairs(int arr[],int sum)
    {
        // Declares and initializes the whole array as false
        boolean[] binmap = new boolean[MAX];
 
        for (int i=0; i<arr.length; i++)
        {
            int temp = sum-arr[i];
 
            // checking for condition
            if (temp>=0 && binmap[temp])
            {
                System.out.println("Pair with given sum " +
                                    sum + " is (" + arr[i] +
                                    ", "+temp+")");
            }
            binmap[arr[i]] = true;
        }
    }
    
    public static void printpairs1(int arr[],int sum){
    	for(int i=0;i<arr.length;i++){
    		if(map.containsKey(arr[i])){
    			continue;
    		}
    		if(map.containsKey(sum - arr[i])){
                System.out.println("Pair with given sum " +
                        sum + " is (" + arr[i] +
                        ", "+(sum-arr[i])+")");
    		}
    		
    		if(!map.containsKey(arr[i])){
    			map.put(arr[i], new Boolean(true));
    		}

    	}
    	
    }
 
    // Main to test the above function
    public static void main (String[] args)
    {
        int A[] = {2,2,8,7,3,5,3,9,9};
        int n = 10;
        printpairs1(A,  n);
    }
}