package ch01;

import java.util.Scanner;

//가우스 덧셈으로 1부터 n까지의 정수의 합 구하기
public class SumGauss_01_08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = (1 + n) * (n / 2) + (n % 2 == 1 ? (1 + n)/2 : 0);		//홀수-짝수 차이
		
		System.out.printf("1부터 %d까지의 합은 %d입니다.", n, sum);
	}
}
