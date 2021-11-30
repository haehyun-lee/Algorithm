import java.util.*;

// HashMap 정렬
public class Ex_11652 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            long val = sc.nextLong();
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        List<Long> keySetList = new ArrayList<>(map.keySet());
        // 카드 개수 내림차순 → 카드 넘버 오름차순
        Collections.sort(keySetList, new Comparator<Long>() {
            @Override
            public int compare(Long key1, Long key2) {
                Integer val1 = map.get(key1);
                Integer val2 = map.get(key2);

                if (val1.equals(val2)) {
                    return key1.compareTo(key2);
                }else{
                    return val2.compareTo(val1);
                }
            }
        });

        if (keySetList.size() > 0) {
            System.out.println(keySetList.get(0));
        }
    }
}
