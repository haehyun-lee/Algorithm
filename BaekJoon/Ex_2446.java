import java.util.Scanner;

//별 찍기 - 9
public class Ex_2446 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        
        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j < n-(i+1); j++){
                sb.append(" ");
            }
            for(int j = 0; j < i*2+1; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i = 1; i <= n-1; i++){
            for(int j = 0; j < n-(i+1); j++){
                sb.append(" ");
            }
            for(int j = 0; j < i*2+1; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
	}
}