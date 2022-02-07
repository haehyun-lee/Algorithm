import java.io.IOException;

// 아스키 코드
public class Ex_11654 {
    public static void main(String[] args) throws IOException {
        // InputStream : 표준 입출력 스트림. 바이트기반 스트림의 조상
        // InputStream.read() : 1 byte를 읽어온다
        int x = System.in.read();
        System.out.println(x);
    }
}
