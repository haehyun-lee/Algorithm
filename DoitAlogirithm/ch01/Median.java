package ch01;
import java.util.Scanner;
// 4개의 정수값을 입력하고 중앙값을 구한 다음 출력

public class Median {

	public static int med3(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			}else if(a >= c) {
				return c;
			}else {
				return a;
			}
		}else{
			if(c >= b) {
				return b;
			}else if(a >= c) {
				return a;
			}else {
				return c;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.print("a의 값: ");
		a = stdIn.nextInt();
		System.out.print("b의 값: ");
		b = stdIn.nextInt();
		System.out.print("c의 값: ");
		c = stdIn.nextInt();
		
		int med = med3(a, b, c);
		
		System.out.println("중앙값은 "+ med +"입니다.");
	}
}
