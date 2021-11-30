import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 국영수
public class Ex_10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Student[] students = new Student[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            students[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(students);

        for (Student std : students) {
            System.out.println(std);
        }
    }
}

class Student implements Comparable {
    String name;
    int kor;
    int eng;
    int math;

    Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student std = (Student)o;
            if (this.kor == std.kor) {
                if (this.eng == std.eng) {
                    if (this.math == std.math) {
                        // 이름 오름차순
                        return this.name.compareTo(std.name);
                    }else{
                        // 수학점수 내림차순
                        return std.math - this.math;
                    }
                }else{
                    // 영어점수 오름차순
                    return this.eng - std.eng;
                }
            }else{
                // 국어점수 내림차순
                return std.kor - this.kor;
            }
        }else{
            return -1;
        }
    }
}
