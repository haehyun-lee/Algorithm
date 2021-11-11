import java.util.Scanner;

//별 찍기 (오른쪽 정렬)
public class Ex_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String format = String.format("%%%ds\n", n);	//n자릿수 만큼 출력하고, 빈칸은 공백 채우기
        for(int i = 1; i <= n; i++){
            String star = "";
            for(int j = 1; j <= i; j++){
                star += "*";
            }
            System.out.printf(format, star);
        }
	}

}