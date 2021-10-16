package ch01;

import java.util.Scanner;

//가운데 정렬 숫자 피라미드 출력
public class NumPira_01_17 {
	static void numpira(int n) {		
		for(int i=1; i<=n; i++) {			
			for(int j=1; j<=n-i+1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(i-1)*2+1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("숫자 피라미드를 출력합니다.");
		
		do {
			System.out.print("몇 단입니까?");
			n = stdIn.nextInt();
		} while(n < 1);
		
		numpira(n);		
	}
}
