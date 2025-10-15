package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For current date
		LocalDate dt = LocalDate.now();
		System.out.println(dt); // YYYY-MM-DD

		// For current time
		LocalTime time = LocalTime.now();
		System.out.println("The current time is " + ":" + time);
		
		//It will give current time and date 
		LocalDateTime current=LocalDateTime.now();
		System.out.println(current);
		
		//to print in a particular format
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatdateandtime=current.format(format);
		System.out.println(formatdateandtime);
		
		//printing months, days, and seconds
		Month month=current.getMonth();
		System.out.println(month);
		
		int day=current.getDayOfMonth();
		System.out.println(day);
		
		int year=current.getDayOfYear();
		System.out.println(year);
		
		int seconds=current.getSecond();
		System.out.println(seconds);
		
		
		//printing some specifieddate
		LocalDate date2=LocalDate.of(2024, 10, 25);
		System.out.println(date2);
		
	
	}

}
