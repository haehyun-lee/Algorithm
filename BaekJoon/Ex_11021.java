import java.util.Scanner;

public class Ex_11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        
        int t = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < t; i++){
            String str = sc.nextLine();
            int a = str.charAt(0) - '0';
            int b = str.charAt(2) - '0';
            
            sb.append(String.format("Case #%d: %d", i+1, a+b)).append("\n");
        }
        System.out.println(sb);
	}

}
