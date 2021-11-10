import java.util.Scanner;

public class Ex_11718 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            sb.append(line).append("\n");
        }
        System.out.print(sb);
	}

}