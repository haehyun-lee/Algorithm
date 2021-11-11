import java.util.Scanner;

//별 찍기 (가운데정렬)
public class Ex_2442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            for(int j = n-i-1; j > 0; j--){
                sb.append(" ");
            }
            for(int j = 0; j < i * 2 + 1; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
	}
}
