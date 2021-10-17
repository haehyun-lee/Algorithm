package ch02;

import java.util.Scanner;

//기수 변환
public class CardConvRev {
	//정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;		//변환 후 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";	//16진수까지면 F까지만 사용됨
		
		do {
			d[digits++] = dchar.charAt(x % r);					//2진수 나머지 : 0~1, 8진수 나머지 : 0~7, 16진수 나머지 : 0~F
			x /= r;
		}while(x != 0);
		
		return digits;
	}
	
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while(x != 0);		
		
		//역순 정렬 (앞자리-뒷자리 순)
		for(int i=0; i< digits/2; i++) {
			char tmp = d[i];
			d[i] = d[digits-i-1];
			d[digits-i-1] = tmp;
		}
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = 28;
		char[] d = new char[32];
		
		int digits = cardConv(n, 16, d);	//문자배열, 자릿수값 획득
		
		for(int i=0; i<digits; i++) {
			System.out.print(d[i]);
		}
	}
}
