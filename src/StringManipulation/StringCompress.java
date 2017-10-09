package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCompress {
	public static String str = "faabbccccaaaaadd";

	public static String stringReplace(String str){		
		StringBuffer dest = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            int runLength = 1;
            while (i+1 < str.length() && str.charAt(i) == str.charAt(i+1)) {
                runLength++;
                i++;
            }
            dest.append(str.charAt(i));
            dest.append(runLength);
            
        }
        return dest.toString();

	}
	/*
    public static String decode(String source) {
        StringBuffer dest = new StringBuffer();
        Pattern pattern = Pattern.compile("[0-9]+|[a-zA-Z]");
        Matcher matcher = pattern.matcher(source);
        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            matcher.find();
            while (number-- != 0) {
                dest.append(matcher.group());
            }
        }
        return dest.toString();
    }*/
	
	public static void main(String[] args) {
		String str1 = stringReplace(str);
		System.out.println(str1);
	}
	
	/*
	StringBuilder sbr = new StringBuilder();
	char current = ' ';
	char last = ' ';
	int count;
	for(int i=0;i<str.length();i++){
		last = str.charAt(i);
		count = 1;
		if(i == str.length()-1){
			sbr.append(current);
			sbr.append(count);
		}
		for(int j=i+1;j<str.length();j++){
			current = str.charAt(j);

			if(last == current){
				count++;
			} else{					
				sbr.append(last);
				sbr.append(count);
				i = j-1;
				break;
			}

			if(j == str.length()-1 ){
				sbr.append(last);
				sbr.append(count);
				i=j;
				break;
			}

		}
	}
	return sbr.toString(); */

}
