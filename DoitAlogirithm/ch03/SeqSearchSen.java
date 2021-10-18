package ch03;

import java.util.Scanner;
//선형 검색 (보초법)

public class SeqSearchSen {
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;							//검색 대상 마지막에 key값 추가
		
		while(true) {
			if(a[i] == key) {
				break;
			}
			i++;
		}
		
		return i==n ? -1 : i;				//검색 성공-실패 여부 체크
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟 수 :");
		int num = stdIn.nextInt();
		int[] x = new int[num+1];				//key값 들어갈 자리 준비
		
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
