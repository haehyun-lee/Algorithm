import java.util.Scanner;

public class Ex_11720 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		String num = sc.nextLine();
		int sum = 0;
		
		for(int i=0; i < t; i++) {
			sum += num.charAt(i) - '0';
		}
		System.out.println(sum);
	}

}
