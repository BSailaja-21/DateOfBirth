package dateandtime;

import java.time.LocalDate; //predefined class
import java.time.Period;

public class DateAndTimeexample { //user defined class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dob= LocalDate.of(2004, 10, 21);
		
		//current date
		LocalDate today=LocalDate.now();
		//Calculate the period b/w dob and today
	    Period age= Period.between(dob,  today);
	    System.out.println("you are " + age.getYears() +"YEARS,"+age.getMonths() +"Months," +age.getDays() +"Days");

	}

}
