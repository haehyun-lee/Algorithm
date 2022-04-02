import java.util.Scanner;

public class Ex_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();

        if (dice1 == dice2 && dice2 == dice3) {
            System.out.println(10000 + dice1 * 1000);
        } else if (dice1 == dice2 || dice1 == dice3) {
            System.out.println(1000 + dice1 * 100);
        } else if (dice2 == dice3){
            System.out.println(1000 + dice2 * 100);
        } else {
            System.out.println(Math.max(dice1, Math.max(dice2, dice3)) * 100);
        }
    }
}
