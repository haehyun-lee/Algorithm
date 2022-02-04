// 셀프 넘버
public class Ex_4673 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        int[] selfNum = new int[10001];

        for (int i = 1; i <= 10000 ; i++) {
            int result = i;
            do {
                result = d(result);
                if(result <= 10000)
                    selfNum[result]++;
            }while (result <= 10000);
        }

        for(int i = 1; i <= 10000; i++){
            if(selfNum[i] == 0)
                sb.append(i + "\n");
        }
        System.out.print(sb);
    }

    static int d(int n){
        int sum = n;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
