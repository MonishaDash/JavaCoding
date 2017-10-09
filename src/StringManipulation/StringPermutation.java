package test;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {
	public static Set<String> stringPermutation(String perm,String word,Set<String> items){
		
		if(word.length() ==0 || word.isEmpty()){
			items.add(perm);
			//System.out.println(perm);
		}
		for(int i=0;i<word.length();i++){
			stringPermutation(perm+word.charAt(i),word.substring(0, i)+word.substring(i+1, word.length()),items);
		}
		
		return items;
	}
	
	public static void main(String[] args) {
		String str = new String("1234");
		Set<String> items = new HashSet<String>();
		stringPermutation("",str,items);		
		items.forEach(System.out::println);
	}

}
