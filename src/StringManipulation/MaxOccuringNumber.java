package test;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuringNumber {
	public static Integer[] arr = {1,1,1,2,3,4,5,4,2,3,2};
	
	public void maxCount(){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int max_occ = 0;
		int max_val = 0;
		for(int i : arr){
			if(map.containsKey(i)){
				map.put(i, map.get(i)+1);
			}else{
				map.put(i, 1);
			}
			if(map.get(i) > max_occ){
				max_val = i;
				max_occ = map.get(i);
			}
		}
		//System.out.println("max val: "+ max_val);
		//System.out.println("max count: "+ max_occ);
		for(Map.Entry<Integer, Integer> e : map.entrySet()){
			if(e.getValue() == max_occ){
			System.out.print(e.getKey());
			System.out.print(" ");
			System.out.print(e.getValue());
			System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		
		MaxOccuringNumber obj = new MaxOccuringNumber();
		obj.maxCount();
		
	}

}
