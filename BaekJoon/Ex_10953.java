import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Ex_10953 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        int t = Integer.parseInt(br.readLine());	//nextInt()하면 해당 라인은 다음까지 그대로 남아있게됨
        
        for(int i=0; i<t; i++){
            String str = br.readLine();
            int a = str.charAt(0) - '0';			//char타입 정수 - '0' = 실제 정수값
            int b = str.charAt(2) - '0';
            
            sb.append(a+b).append("\n");
        }
        
        System.out.println(sb);
	}

}
