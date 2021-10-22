package level1;

//가로 길이가 n, 세로 길이가 m인 직사각형 그리기 - 중첩 반복문
import java.util.Scanner;

public class DrawSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=0; i<b; i++) {
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		System.out.println(("*".repeat(a) + "\n") * b);
	}
}
