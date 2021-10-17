package ch02;

import java.util.Scanner;

//기수 변환 (8진수, 16진수 변환 미완성)
public class CardConvEx_07 {
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;			//자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int rest =0;
		
		System.out.printf("%2d|%7d\n", r, x);
		do {
			System.out.println("  +-------");
			if(x/r != 0)
				System.out.printf("%2d|%7d ···%d\n", r, x/r, x%r);
			else
				System.out.printf("   %7d ···%d", x/r, x%r);
			
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while(x != 0);
		System.out.println();
		
		//역순 정렬
		for(int i=0; i < digits/2; i++) {
			char tmp = d[i];
			d[i] = d[digits-i-1];
			d[digits-i-1] = tmp;
		}
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;						//변환하는 정수
		int cd;						//기수
		int dno; 					//변환후의 자릿수
		char[] cno = new char[32];	//변환 후 각 자리의 숫자를 넣어두는 문자 배열
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			System.out.print("변환하는 음이 아닌 정수 : ");
			no = stdIn.nextInt();
		} while(no <= 0);
		
		do {
			System.out.print("어떤 진수로 변환할까요?(2-36) : ");
			cd = stdIn.nextInt();
		} while(cd < 2 && 36 < cd);
		
		dno = cardConv(no, cd, cno);
		
		System.out.printf("%d진수로는 ", cd);
		for(int i=0; i<dno; i++) {
			System.out.print(cno[i]);
		}
		System.out.println(" 입니다.");
	}
}
