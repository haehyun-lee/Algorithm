import java.util.Scanner;

// OX 퀴즈
public class Ex_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(sc.nextLine());
        int score, totalScore;

        for(int i = 0; i < n; i++){
            score = 1;
            totalScore = 0;
            String ox = sc.nextLine();
            for(char ch : ox.toCharArray()){
                if(ch == 'O'){
                    totalScore += score;
                    score++;
                }else{
                    score = 1;
                }
            }
            sb.append(totalScore + "\n");
        }
        System.out.println(sb);
    }
}
