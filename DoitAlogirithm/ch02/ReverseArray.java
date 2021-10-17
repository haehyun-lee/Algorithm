package ch02;

import java.util.Scanner;

//배열 요소 값을 읽어들여 역순으로 정렬
public class ReverseArray {
	//배열 요소 a[idx1]과 a[idx2]를 바꿈 (매개변수 a는 실제 배열을 참조)
	static void swap(int[] a, int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}
	
	//배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {	
		for(int i=0; i<a.length/2; i++) {
			//a[i]값과 a[a.length-i-1] 값 변경
			swap(a, i, a.length-i-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟 수 : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		//사용자 입력값으로 배열 초기화
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		//배열 역순 정렬
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"] : "+x[i]);
		}
		
	}

}
