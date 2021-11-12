import java.util.Scanner;

// 별 찍기 - 17
public class Ex_10992 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < n - 1; i++){
            for(int j = i+1; j < n; j++){    //조건을 그대로 두고, 반복마다 초기값을 증가하는 방식
                sb.append(" ");
            }
            sb.append("*");
            for(int j = 0; j < i * 2 - 1; j++){
                sb.append(" ");
            }
            if(i != 0) { sb.append("*"); }
            sb.append("\n");                //한줄당 별은 무조건 2개 출력
        }
        System.out.print(sb);
        
        sb.delete(0, sb.length());
        for(int i = 0; i < n*2-1; i++)
            sb.append("*");
        System.out.print(sb);
	}

}