package ch01;

import java.util.Scanner;
// 4개의 정수를 입력하고 최대값을 구한 다음 출력한다.

public class Max4 {
	// 4개의 정수 중 최대값을 반환
	public static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a, b, c, d;

		// 사용자 입력 받기
		System.out.print("a의 값 : ");  a = stdIn.nextInt();
		System.out.print("b의 값 : ");  b = stdIn.nextInt();
		System.out.print("c의 값 : ");  c = stdIn.nextInt();
		System.out.print("d의 값 : ");  d = stdIn.nextInt();
		
		int max = max4(a, b, c, d);
		
		System.out.println("최대값은 " + max + "입니다.");	
	}
}
