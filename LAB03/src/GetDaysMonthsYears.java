import java.time.*;

/**
 * Name : Yalagooradappa Hebbal
 * Description : print the duration in days, months and years with regards to the current system date
 * Date : 16/03/2021
 */
public class GetDaysMonthsYears {

	public static void main(String[] args) {
      
        LocalDate ld1=LocalDate.of(2018,5,19);  
        LocalDate curDate= LocalDate.now();  
        Period p = Period.between(ld1, curDate);
        System.out.println("Duration in the days : "+p.getDays());
        System.out.println("Duration in the months : "+p.getMonths());
        System.out.println("Duration in the years : "+ p.getYears());
      
	}

}
