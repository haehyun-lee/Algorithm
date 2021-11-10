import java.util.Scanner;

//직접 구현 - 2007년 M월 D일의 요일 구하기(2007년 1월 1일은 월요일)
public class Ex_1924_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] dayOfWeeks = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int days = 0;
		
		for(int i=0; i < month-1; i++) {
			days += months[i];
		}
		days += day;
		
		System.out.println(dayOfWeeks[days % 7]);
	}

}
