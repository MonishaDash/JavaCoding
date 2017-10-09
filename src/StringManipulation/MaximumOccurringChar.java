package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class MaximumOccurringChar {

    static final String TEST_CASE_1 = "abc aa bba b";


    public static void main(String[] args) {
        MaximumOccurringChar test = new MaximumOccurringChar();
        List<Character> result = test.maximumOccurringChars(TEST_CASE_1, true);
        System.out.println(result);
    }


    public List<Character> maximumOccurringChars(String str) {
        return maximumOccurringChars(str, false);
    }

    // set skipSpaces true if you want to skip spaces
    public List<Character> maximumOccurringChars(String str, Boolean skipSpaces) {
        Map<Character, Integer> map = new HashMap<>();
        Hashtable<Character, Integer> map1 = new Hashtable<>();
        List<Character> occurrences = new ArrayList<>();
        Character ch_max = 'z';
        int maxOccurring = 0;

        // creates map of all characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (skipSpaces && ch == ' ')      // skips spaces if needed
                continue;

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }

            if (map.get(ch) > maxOccurring) {
                maxOccurring = map.get(ch);         // saves max occurring
                ch_max = ch;
            }
        }
        
       // System.out.println(maxOccurring);
        //System.out.println(ch_max.toString());

        // finds all characters with maxOccurring and adds it to occurrences List
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxOccurring) {
                occurrences.add(entry.getKey());
            }
        }
        
//        for(Character c:map.keySet()){
//        	if(map.get(c) == maxOccurring ){
//        		System.out.println(c);
//        		
//        	}
//        }

        return occurrences;
    }
}