package ch03;

import java.util.Scanner;
//선형 검색

public class SeqSearch {
	static int seqSearch(int[] a, int n, int key) {
		for(int i=0; i<n; i++) {
			if(a[i] == key) {
				return i;		//검색 성공
			}
		}
		return -1;				//검색 실패
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
