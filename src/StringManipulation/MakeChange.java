package test;

public class MakeChange {

	public static void main(String[] args) {
		int ways = makeChangeIterative(128);
		System.out.println(ways);

	}
	 public static int makeChangeIterative(int total) {
	    	int ways = 0;
	    	for (int count25 = 0; count25 * 25 <= total; count25++) {
	    		int a = count25 * 25;
	    		for (int count10 = 0; a + count10*10 <= total; count10++) {
	    			int b = a + count10*10;
	    			for (int count5 = 0; b + count5*5 <=total; count5++) {
	    				int sum = count25*25 + count10*10 + count5*5;
	    				// when the first three types of coins are selected, the way of selecting coins
	    				// with denomination 1 cent has already known.
	    				if (sum <= total) {
	    					++ways;
	    				}
	    			}
	    		}
	    	}
	    	return ways;
	    }
}
