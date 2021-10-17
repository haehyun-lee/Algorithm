package ch02;

import java.util.Scanner;

public class DayOfYearPercent {
	static int[][] mdays = {
			{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	//평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	//윤년
	};
	
	//윤년(1), 평년(0) 체크
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 && year % 400 == 0) ? 1 : 0;
	}
	
	//서기 y년 m월 d일의 그 해 경과 일 수를 구함
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		
		for(int i=1; i<m; i++) {
			days += mdays[isLeap(y)][i-1];
		}
		
		return days;
	}
	
	//해당 년월일의 경과 일수를 퍼센트로 표시
	static void printPercent(int y, int m, int d) {
		float totalDays = (isLeap(y) == 1) ? 365f : 366f;
		
		for(int i=0; i<m; i++) {
			System.out.print("■");
		}
		for(int i=0; i<12-m; i++) {
			System.out.print("□");
		}
		
		int percent = (int)((dayOfYear(y, m, d) / totalDays) * 100);
		System.out.println(" " + percent + "%");
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do {
			System.out.print("년 : ");
			int year = stdIn.nextInt();
			System.out.print("월 : ");
			int month = stdIn.nextInt();
			System.out.print("일 : ");
			int day = stdIn.nextInt();
			
			printPercent(year, month, day);
			
			System.out.println("한번 더 할까요? (1. 예, 2. 아니오) : ");
			retry = stdIn.nextInt();
		}while(retry == 1);
		
	}

}
