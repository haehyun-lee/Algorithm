import java.util.Scanner;

//별 찍기 (모래시계)
public class Ex_2445 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                sb.append("*");
            }
            for(int j = 1; j <= (n * 2) - (i * 2); j++){
            	sb.append(" ");
            }
            for(int j = 1; j <= i; j++){
            	sb.append("*");
            }
            sb.append("\n");
        }
        for(int i = n -1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
            	sb.append("*");
            }
            for(int j = 1; j <= (n * 2) - (i * 2); j++){
            	sb.append(" ");
            }
            for(int j = 1; j <= i; j++){
            	sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
	}

}