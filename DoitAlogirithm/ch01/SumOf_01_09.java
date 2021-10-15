package ch01;
import java.util.Scanner;

public class SumOf_01_09 {
	//정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환
	static int sumof(int a, int b) {
		int max, min;
		if(a > b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		
		int sum = 0;
		
		for(int i=min; i<=max; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a부터 b까지의 합을 구합니다.");
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		
		System.out.printf("%d부터 %d까지의 합은 %d입니다.", a, b, sumof(a, b));
	}
}
