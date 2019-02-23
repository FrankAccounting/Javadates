package chapter4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class AdvancedJava {
	public static void main (String[] args) {
		LocalDate date1 = LocalDate.of(1987, 3, 9);
		LocalDate date2 = LocalDate.of(1988, 10, 10);

		
		Period p1 = Period.between(date1, date2);
		

		System.out.print(		"years: " + p1.getYears() + " Months: "+p1.getMonths() + " Days: " +  p1.getDays()+"\n");
		
		
		LocalDate date3 = date2.plusYears(1).plusMonths(7).plusDays(1);
		System.lineSeparator();
		System.out.print("Date For Third:  " +date3);
}

}
