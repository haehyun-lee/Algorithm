import java.util.Scanner;

public class Ex_10991 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer star = new StringBuffer("*");
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            System.out.print(star + "\n");
            star.append(" *");
        }
    }
}
