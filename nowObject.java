package pkg;

import java.time.LocalDate;

public class nowObject {
	
	@Override
	public String toString() {
		
		LocalDate date = LocalDate.now();
		String result = date.getYear() + "/" + date.getMonthValue() + "/" + date.getDayOfMonth();
		
		return result;
	}
	
	public nowObject() {
		LocalDate date = LocalDate.now();
		
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();
		int year = date.getYear();
		
		// use Gauss's method for determining the day of the weeks 
		double m; 	// month
		int y;
		int dow; 	// day of the week; Sun = 0, ..., Sat = 6;
		
		m = (month - 2+ 12) %12;
		if(month <= 2) {
			year--;
		}
		y = 5 * (year % 4) + 4 * (year%100) + 6 * (year %400);
		dow = (day+ (int)(2.6*m - 0.2) + y) % 7;
	}
	
	
}
