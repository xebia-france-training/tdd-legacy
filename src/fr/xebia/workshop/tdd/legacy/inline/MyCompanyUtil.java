package fr.xebia.workshop.tdd.legacy.inline;

import java.util.Calendar;
import java.util.Date;

/**
 * Replace those utility methods with more robust third parties equivalent methods (ex: common-lang from Apache)
 * using the test/delegate/inline pattern  
 */
public class MyCompanyUtil {

	public static boolean isValid(String s){
		return s != null && s.trim() != "";
	}
	
	public static String capitalize(String s){
		if(s == null) return null;
		if(s.trim().equals(""))	return s;
		char c = s.charAt(0);
		return String.valueOf(Character.toUpperCase(c)) + s.substring(1, s.length());
	}
	
	public static Date addNumberOfDays(Date day, int number){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(day);
		calendar.add(Calendar.DAY_OF_MONTH, number);
		return calendar.getTime(); 
	}
}
