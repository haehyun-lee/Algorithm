package ch01;

import java.util.Scanner;

public class Difference_01_10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a, b = 0;
		
		System.out.print("a의 값 : ");
		a = stdIn.nextInt();
		
		while(true) {
			System.out.print("b의 값 : ");
			b = stdIn.nextInt();
			if(a >= b) {
				System.out.println("a보다 큰 값을 입력하세요!");
			}else {
				break;
			}
		}
		
		int diff = b-a;
		
		System.out.println("b-a는 "+ diff +"입니다.");
	}
}
