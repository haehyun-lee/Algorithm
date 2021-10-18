package ch03;

import java.util.Scanner;
//선형 검색 과정

public class SeqSearchProcess_02 {
	static int seqSearch(int[] a, int n, int key) {
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
		
		//검색 과정	
		for(int i=0; i<n; i++) {
			System.out.printf("   |");
			System.out.printf(String.format("%%%ds*\n", (i*4)+3), "");	//여백 + *
			System.out.printf("%3d|", i);
			for(int j=0; j<n; j++) {
				System.out.printf("%4d", a[j]);
			}
			System.out.println("\n   |");
			
			if(a[i] == key) {
				return i;
			}
		}
		
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
		
		int idx = seqSearch(x, num, key);
		if(idx == -1) {
			System.out.println("해당 값의 요소가 없습니다.");
		}else {
			System.out.println(key + "은 " + "x[" + idx + "]에 있습니다.");
		}
	}
}
