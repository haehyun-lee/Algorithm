import java.util.*;

/*
    학생 정보 클래스
    정렬에 점수가 사용되지만, 실제 출력되는 값은 이름이기 때문에 이 값들을 하나의 단위로 묶어 처리해야함
    점수는 정렬에 사용되기 때문에 int 타입으로 파싱해서 저장
 */
class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // 객체 정렬 기준은 성적 오름차순
    @Override
    public int compareTo(Student other) {
        return this.score - other.score;
        // if(this.score < other.score) { return -1; } return 1;
    }
}

public class Sorting2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 라인별로 입력받은 학생정보로 Student 객체 생성
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            students.add(new Student(name, score));
        }

        Collections.sort(students);

        for (Student student : students) {
            System.out.print(student.getName() + " ");
        }
    }
}
