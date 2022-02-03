import java.util.Scanner;

public class Ex_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        if(min < 45){
            if(hour == 0){
                System.out.printf("%d %d", 23, 60 - (45 - min));
            }else{
                System.out.printf("%d %d", --hour, 60 - (45 - min));
            }
        }else{
            System.out.printf("%d %d", hour, min - 45);
        }
    }
}
