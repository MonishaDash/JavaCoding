package test;

import java.time.LocalDate;

public class TimeSubst {

	public static void main(String[] args) {
		LocalDate obj =  LocalDate.parse("2016-03-10");
		System.out.println(obj.minusDays(12).toString());
		
	}

}
