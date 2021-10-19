package ch03;

import java.util.Scanner;
//이진 검색 - 검색할 값과 같은 값을 갖는 요소가 하나 이상일 경우 그 요소 중에서 맨 앞의 요소 검색

public class BinSearchX_05 {
	static int binSearchX(int[] x, int n, int key) {
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pr-pl)/2;
			
			if(x[pc] == key) {
				for(; pc > pl; pc--) {		//pl~pc 범위 탐색
					if(x[pc-1] < key) {		//다른 값이 나올 때가지 반복, 앞의 값이 다를 수도 있으므로 pc-1로 앞 값 체크
						break;
					}
				}
				return pc;
			}else if(x[pc] > key) {
				pr = pc-1;
			}else if(x[pc] < key) {
				pl = pc+1;
			}			
		} while(pl <= pr);
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟 수 :");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		System.out.print("x[0] : ");
		x[0] = stdIn.nextInt();
		
		for(int i = 1; i<num; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i] = stdIn.nextInt();
			}while(x[i] < x[i-1]);
		}
		
		System.out.print("검색할 값 : ");
		int key = stdIn.nextInt();
		
		int idx = binSearchX(x, num, key);
		if(idx == -1) {
			System.out.println("해당 값의 요소가 없습니다.");
		}else {
			System.out.println(key + "은 " + "x[" + idx + "]에 있습니다.");
		}
	}
}
