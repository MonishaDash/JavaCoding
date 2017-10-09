package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Simple{
	
}

 public class ReflectionTest {
	
	public static void main(String[] args){
		
		List<String> al = new ArrayList<String>();
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");
	      
	      Iterator itr = al.iterator();
	      
	      while(itr.hasNext()){
	    	  System.out.println(itr.next());
	      }
	      


//		try {
//			 Class c = Class.forName("Simple");
//			System.out.println(c.getName());
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}


