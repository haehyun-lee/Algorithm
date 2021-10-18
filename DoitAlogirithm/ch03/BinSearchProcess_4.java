package ch03;

import java.util.Scanner;
//이진 검색 과정

public class BinSearchProcess_4 {
	static int binSearch(int[] a, int n, int key) {
		//헤더
		System.out.print("   |");
		for(int i = 0; i < n; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();
		
		System.out.print("---+");
		for(int i = 0; i < 4 * n + 2; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pr-pl)/2;
			
			System.out.printf("   |");
			//여백+문자 3부분으로 분할해서 출력
			System.out.printf(String.format("%%%ds<-", pl*4+2), "");			//  <-
			System.out.printf(String.format("%%%ds+", (pc-pl-1)*4+3), "");		//   +
			System.out.printf(String.format("%%%ds->\n", (pr-pc-1)*4+2), "");	//  ->

			//pl==pr, pl==pc 경우 체크하기..
			
			System.out.printf("%3d|", pc);
			for(int i=0; i<n; i++) {
				System.out.printf("%4d", a[i]);
			}
			System.out.println("\n   |");
			
			if(a[pc] == key) {
				return pc;
			} else if (a[pc] > key) {
				pr = pc-1;
			} else if (a[pc] < key) {
				pl = pc+1;
			}
		} while(pl<pr);
				
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟 수 :");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = stdIn.nextInt();
		
		int idx = binSearch(x, num, key);
		if(idx == -1) {
			System.out.println("해당 값의 요소가 없습니다.");
		}else {
			System.out.println(key + "은 " + "x[" + idx + "]에 있습니다.");
		}
	}
}
