package test;

public class StringOffset {
	
	public static String findOffset(String str,int offset){
		StringBuilder sbr = new StringBuilder();
		for(int i = 0;i<str.length();i++){
			sbr.append((char)(str.charAt(i)+offset));
		}
		return sbr.toString();

	}
	public static void main(String[] args) {
		String str = new String("abc");
		String strReturn = findOffset(str,2);
		System.out.println(strReturn);
	}
}
