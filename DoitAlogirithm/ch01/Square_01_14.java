package ch01;

import java.util.Scanner;

//입력한 수를 한변으로 하는 정사각형 출력
public class Square_01_14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("사각형을 출력합니다.");
		
		do {
			System.out.print("단 수 : ");
			n = stdIn.nextInt();
		} while(n < 1);
				
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
