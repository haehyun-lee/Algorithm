package ch01;
import java.util.Scanner;
//1, 2, ... , n의 총합 출력

public class SumFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);		//Standard Input - keyboard
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		//i초기값 및 for 범위 주의 (미만, 이하, 이상, 초과) 
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		System.out.printf("1부터 %d까지의 합은 %d입니다.", n, sum);
	}
}
