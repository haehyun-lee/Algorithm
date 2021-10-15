package ch01;

import java.util.Scanner;

//양의 정수를 입력하면 자릿수를 출력
public class DigitsNo_01_11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		do {
			System.out.print("정수값 : ");
			n = stdIn.nextInt();
		}while(n < 0);
		
		int digit =0;		//자리수
		while(n > 0) {
			n /= 10;
			digit++;
		}
		
		System.out.println("그 수는 "+ digit +"자리입니다.");
	}
}

//public class DigitsNo_01_11 {
//
//	public static void main(String[] args) {
//		Scanner stdIn = new Scanner(System.in);
//		int digit = 0;
//		
//		System.out.print("양의 정수를 입력하세요. : ");
//		int n = stdIn.nextInt();
//		do {
//			n /= 10;
//			digit++;
//		}while(n != 0);
//		
//		System.out.println("그 수는 "+ digit +"자리입니다.");
//	}
//}
