import java.util.Scanner;

public class Ex_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int[] number = new int[10];

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String result = String.valueOf(a * b * c);

        // 각 숫자 개수 카운트
        for(String str : result.split("")){
            int idx = Integer.parseInt(str);
            number[idx]++;
        }

        // 각 숫자 개수 출력
        for(int num : number){
            sb.append(num + "\n");
        }
        System.out.print(sb);
    }
}
