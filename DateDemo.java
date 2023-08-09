package FileHandling;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateDemo {

	public static void main(String[] args) {
		LocalDate date =LocalDate.now();
		System.out.println("Date="+date);
		
		LocalTime time= LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dt= LocalDateTime.now();
		System.out.println(dt);
		
		LocalDate newDate=LocalDate.of(2003, 03, 26);
		System.err.println("New Date="+newDate);
		
		
		
		
		
				
				

	}

}
