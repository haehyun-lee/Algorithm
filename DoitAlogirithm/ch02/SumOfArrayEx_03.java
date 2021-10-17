package ch02;

import java.util.Scanner;

public class SumOfArrayEx_03 {
	//배열 a의 모든 요소의 합계를 구하여 반환
	static int sumOf(int[] a) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟 수 : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		int sum = sumOf(x);
		System.out.println("배열 요소의 합은 "+sum+"입니다.");
	}
}
