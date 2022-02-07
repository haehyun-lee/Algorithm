import java.util.Scanner;

public class Ex_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();    // 소문자 변환
        int[] count = new int[26];    // 알파벳 사용 횟수

        for(char ch : s.toCharArray()){
            count[ch - 'A']++;
        }

        int max = 0;
        int maxCh = -2;             // '?' : 63, 'A' : 65
        for(int i = 0; i < count.length; i++){
            if(count[i] > max){
                max = count[i];
                maxCh = i;
            } else if(count[i] == max){
                maxCh = -2;
            }
        }

        System.out.println((char)(maxCh + 'A'));
    }
}
