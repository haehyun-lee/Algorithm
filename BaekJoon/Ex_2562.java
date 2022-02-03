import java.util.Arrays;
import java.util.Scanner;

public class Ex_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        int max = Integer.MIN_VALUE;
        int maxSeq = 0;

        for(int i = 0; i < 9; i++){
            num[i] = sc.nextInt();
        }

        for(int i = 0; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
                maxSeq = i+1;
            }
        }

        System.out.println(max);
        System.out.println(maxSeq);
    }
}
