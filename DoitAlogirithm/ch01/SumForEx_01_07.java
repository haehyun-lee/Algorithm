package ch01;

import java.util.Scanner;

//총합 1+2+3+...+n의 형식으로 출력
public class SumForEx_01_07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			System.out.print(i==n ? i : i+" + ");		//마지막 값은 +없이 출력
			sum += i;
		}
		System.out.print(" = " + sum);
	}
}
