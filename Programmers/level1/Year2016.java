package level1;

import java.time.LocalDate;
import java.util.Calendar;

public class Year2016 {
	public String solution(int a, int b) {
        String answer = "";
        LocalDate date = LocalDate.of(2016, a, b);
        answer = date.getDayOfWeek().toString().substring(0, 3);
        
        return answer;
    }
	
	public String solution2(int a, int b) {
        String answer = "";
		final String[] DAY_OF_WEEK = { "", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"} ;
        
        Calendar cal = Calendar.getInstance();
        cal.set(2016, a-1, b);
        answer = DAY_OF_WEEK[cal.get(Calendar.DAY_OF_WEEK)];
        
        return answer;
    }
}