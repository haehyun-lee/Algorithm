package ch02;

import java.util.Scanner;

//날짜 클래스 + 이전/이후 날짜

public class YMD {
	int y;		//년
	int m;		//월(1~12)
	int d;		//일(1~31)
	
	static int[][] mdays = {
			{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },	//평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },	//윤년
	};
	
	//year 윤년 체크 (윤년:1/평년:0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	//생성자
	YMD(int y, int m, int d){
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	//n일 뒤의 날짜를 반환
	YMD after(int n) {
		YMD afterYmd = new YMD(this.y, this.m, this.d);
		if(n < 0) {
			return (before(-n));
		}
		
		afterYmd.d += n;
		
		//일(d)이 월(m)을 넘어가는 경우 반복
		while(afterYmd.d > mdays[isLeap(afterYmd.y)][afterYmd.m - 1]) {
			afterYmd.d -= mdays[isLeap(afterYmd.y)][afterYmd.m - 1];	//객체.멤버 - this.멤버 차이 주의
			//월(m)이 연(y)을 넘어가는 경우
			if(++afterYmd.m > 12) {
				afterYmd.y++;
				afterYmd.m = 1;
			}
		}
			
		return afterYmd;
	}
	
	//n일 앞의 날짜를 반환
	YMD before(int n) {
		YMD beforeYmd = new YMD(this.y, this.m, this.d);
		if(n < 0) {
			return (after(-n));
		}
		
		beforeYmd.d -= n;
		
		while(beforeYmd.d < 1) {
			if(--beforeYmd.m < 1) {
				beforeYmd.y--;
				beforeYmd.m = 12;
			}
			beforeYmd.d = mdays[isLeap(beforeYmd.y)][beforeYmd.m-1] + beforeYmd.d;
		}
		
		return beforeYmd;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("년 : ");
		int year = stdIn.nextInt();
		System.out.print("월 : ");
		int month = stdIn.nextInt();
		System.out.print("일 : ");
		int day = stdIn.nextInt();
		
		YMD ymd = new YMD(year, month, day);
		
		System.out.print("몇 일 앞/뒤의 날짜를 구할까요?：");
		int n = stdIn.nextInt();
		
		YMD afterYmd = ymd.after(n);
		System.out.printf("%d년 %d월 %d일에서 %d일 뒤는 %d년 %d월 %d일 입니다.\n", year, month, day, n, afterYmd.y, afterYmd.m, afterYmd.d);
		
		YMD beforeYmd = ymd.before(n);
		System.out.printf("%d년 %d월 %d일에서 %d일 앞은 %d년 %d월 %d일 입니다.\n", year, month, day, n, beforeYmd.y, beforeYmd.m, beforeYmd.d);
	}
}
