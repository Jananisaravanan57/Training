package Collections;

import java.text.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.*;

public class Date_Time {
	public static void main(String[] args)
	   {
	      Date d = new Date();
	      System.out.println("Date: " +d);
	      
	      SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
	      System.out.println("Date: " +a.format(d));
	      
	      SimpleDateFormat a1 = new SimpleDateFormat("hh:mm:ss a");
	      System.out.println("The Current Time is " +a1.format(d));
	      
	      SimpleDateFormat a2 = new SimpleDateFormat("E");
	      System.out.println("Today is " +a2.format(d));
	      
	      Calendar cal = Calendar.getInstance();
	        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	        System.out.println("Last day of this month : "+cal.getTime());
			System.out.println();
			
			LocalDate today = LocalDate.now();    
		     LocalDate userday = LocalDate.of(2020, Month.MAY, 15); 
		     Period diff = Period.between(userday, today); 
		     System.out.println("\nDifference between "+ userday +" and "+ today +": " 
		     + diff.getYears() +" Year(s) and "+ diff.getMonths() +" Month()s\n");
	   }
}
