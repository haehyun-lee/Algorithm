package ch03;

import java.util.Scanner;
//선형 검색 (보초법) - for문

public class SeqSearchSenFor_01 {
	static int seqSearchSen(int[] a, int n, int key) {
		int i;
		
		a[n] = key;
		
		for(i=0; a[i] != key; i++);		//for문 종료조건이 꼭 범위일 필요는 없음
		
		return i==n ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟 수 :");
		int num = stdIn.nextInt();
		int[] x = new int[num+1];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = stdIn.nextInt();
		
		int idx = seqSearchSen(x, num, key);
		if(idx == -1) {
			System.out.println("해당 값의 요소가 없습니다.");
		}else {
			System.out.println(key + "은 " + "x[" + idx + "]에 있습니다.");
		}
	}

}
