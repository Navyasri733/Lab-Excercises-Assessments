package LabExc3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateMonthYear {

	public static void main(String[] args) {
		//creating a calender object
		Calendar cal = new GregorianCalendar(2021,01,8);
		
		
		//getting the value of day,month and year calender object
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		
		
		//printing day month and year
		System.out.println("Day: "+day);
		System.out.println("Month: "+month);
		System.out.println("Year: "+year);
		
	}

}
