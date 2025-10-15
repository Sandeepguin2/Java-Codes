package DateTimeAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
 
public class PeriodAndDuration {
	LocalDate dt=LocalDate.now();
	LocalDate dt2=LocalDate.of(2014, Month.DECEMBER, 12);
	Period pp=Period.between(dt, dt2);
	


	

}
