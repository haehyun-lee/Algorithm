package ch02;

import java.util.Scanner;

public class CopyArrayEx_04 {
	//배열 b의 모든 요소를 배열 a에 복사
	static void copy(int[] a, int[] b) {
		int minIdx = (a.length > b.length) ? b.length : a.length;	//배열크기 충돌 방지
		
		for(int i=0; i<minIdx; i++) {
			a[i] = b[i];
		}
		
		//System.arraycopy(b, 0, a, 0, b.length);
	}
	
	static void print(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//배열 초기화
		System.out.print("배열 a의 요솟수 : ");
		int na = stdIn.nextInt();
		int[] a = new int[na];
		for(int i=0; i<na; i++) {
			System.out.print("x["+i+"] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int nb = stdIn.nextInt();
		int[] b = new int[nb];
		for(int i=0; i<nb; i++) {
			System.out.print("x["+i+"] : ");
			b[i] = stdIn.nextInt();
		}
		
		print(a);
		print(b);
		
		System.out.println("b배열을 a배열에 복사합니다.");
		copy(a, b);
		
		print(a);
		print(b);
	}
}
