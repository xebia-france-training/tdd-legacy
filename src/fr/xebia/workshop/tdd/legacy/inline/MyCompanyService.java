package fr.xebia.workshop.tdd.legacy.inline;

import java.util.Date;

public class MyCompanyService {

	public String nextDayBillingStatement(Date today, int amount, String name){
		if(!MyCompanyUtil.isValid(name)){
			throw new IllegalArgumentException("Name should not be null or empty");
		}
		String capitalizeName = MyCompanyUtil.capitalize(name);
		Date nextDay = MyCompanyUtil.addNumberOfDays(today, 1);
		return "Date: "+ nextDay + ", name: " + capitalizeName + ", amount: " + String.valueOf(amount);
	}
}
