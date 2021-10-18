package ch03;

import java.util.Scanner;
//key와 일치하는 모든 요소 검색

public class SeqSearchIndex_03 {
	//key와 일치하는 index, 일치하는 요소 수 반환
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int cntVal = 0;
		
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				idx[cntVal] = i;
				cntVal++;
			}
		}
		
		return cntVal;
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
		
		int[] idx = new int[num];
		int cntVal = searchIdx(x, num, key, idx); 
		
		if(cntVal == 0) {
			System.out.println("해당 값의 요소가 없습니다.");
		}else {
			System.out.print(key + "은(는) 총 "+cntVal+"개이며, ");
			for(int i = 0; i < cntVal; i++) {
				System.out.print("x[" + idx[i] + "] ");
			}
			System.out.println("에 있습니다.");
		}
	}
}
