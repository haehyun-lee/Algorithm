package ch03;

import java.util.Scanner;
//이진 검색

public class BinSearch {
	static int binSearch(int[] x, int n, int key) {
		int pl = 0;						//시작 index
		int pr = n-1;					//끝 index
		
		do {
			int pc = (pr-pl)/2;			//중앙 index
			
			if(x[pc] == key) {
				return pc;				//검색 성공
			}else if(x[pc] > key) {
				pr = pc-1;				//key보다 클 경우(범위 앞으로)
			}else if(x[pc] < key) {
				pl = pc+1;				//key보다 작을 경우(범위 뒤로)
			}			
		} while(pl <= pr);
		
		return -1;						//검색 실패
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟 수 :");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");		//이진검색은 정렬된 데이터에서만 가능
		System.out.print("x[0] : ");
		x[0] = stdIn.nextInt();
		
		for(int i = 1; i<num; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i] = stdIn.nextInt();
			}while(x[i] < x[i-1]);						//앞의 요소보다 큰 값만
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
