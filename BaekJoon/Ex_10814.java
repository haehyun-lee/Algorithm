import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<User> list = new ArrayList<>();

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(sc.nextLine(), " ");

            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            User user = new User(age, name);
            list.add(user);
        }

        Collections.sort(list);

        for (User user : list) {
            System.out.println(user);
        }
    }
}

class User implements Comparable {
    int age;            // 나이
    String name;        // 이름
    int joinSeq;        // 가입 순서
    static int seq;

    User(int age, String name) {
        this.age = age;
        this.name = name;
        this.joinSeq = seq++;
    }

    // 나이 오름차순 → 가입순서 오름차순
    @Override
    public int compareTo(Object o) {
        if (o instanceof User) {
            User user = (User)o;
            if (this.age == user.age) {
                return this.joinSeq - user.joinSeq;
            }else{
                return this.age - user.age;
            }
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return this.age + " " + this.name;
    }
}
