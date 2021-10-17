package ch02;

import java.util.Scanner;

public class CopyReverseArrayEx_05 {
	//배열 b의 모든 요소를 역순으로 배열 a에 복사
	static void copy(int[] a, int[] b) {
		int minIdx = (a.length > b.length) ? b.length : a.length;
		
		for(int i=0; i<minIdx; i++) {
			a[i] = b[minIdx-i-1];		//index 안넘어가게 주의
		}
	}
	
	static void print(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
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
		
		System.out.println("b배열을 a배열에 역순으로 복사합니다.");
		copy(a, b);
		
		print(a);
		print(b);
	}
}
