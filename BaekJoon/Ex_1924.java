import java.time.LocalDate;
import java.util.Scanner;

//LocalDate 사용
public class Ex_1924 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		LocalDate date = LocalDate.of(2007, month, day);
		
		String dayOfWeek = date.getDayOfWeek().toString().substring(0, 3);
		
		System.out.println(dayOfWeek);
	}

}
