package ch01;

import java.util.Scanner;

//가운데 정렬 별 피라미드 출력
public class StarPira_01_16 {
	static void spira(int n) {		
		for(int i=1; i<=n; i++) {			
			for(int j=1; j<=n-i+1; j++) {	//빈 여백은 1씩 공간이 줄어듬 (피라미드를 세로로 자른다고 생각하기)
				System.out.print(" ");
			}
			for(int j=1; j<=(i-1)*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("피라미드를 출력합니다.");
		
		do {
			System.out.print("몇 단입니까?");
			n = stdIn.nextInt();
		} while(n < 1);
		
		spira(n);		
	}
}
