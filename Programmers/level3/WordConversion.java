package level3;

import java.util.*;

// 단어 변환
public class WordConversion {
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();  // 단어 변환 가능 관계

    public int solution(String begin, String target, String[] words) {
        if (!Arrays.asList(words).contains(target)) {
            return 0;
        }

        int answer;

        // begin + words 합치기
        String[] wordsBegin = new String[words.length + 1];
        wordsBegin[0] = begin;
        System.arraycopy(words, 0, wordsBegin, 1, words.length);

        for (int i = 0; i < wordsBegin.length; i++) {
            graph.add(new ArrayList<>());
        }

        // begin + words 단어들의 변환 관계
        for (int i = 0; i < wordsBegin.length - 1; i++) {
            for (int j = i + 1; j < wordsBegin.length; j++) {
                int equal = 0;
                for (int k = 0; k < begin.length(); k++) {
                    if (wordsBegin[i].charAt(k) == wordsBegin[j].charAt(k)) equal++;
                }
                if (equal == begin.length() - 1) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }

        answer = bfs(wordsBegin, 0, target);
        return answer;
    }

    private int bfs(String[] words, int start, String target) {
        boolean[] visited = new boolean[words.length];
        int step = 0;

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int from = q.poll();
//                System.out.printf("step %d : %s\n", step, words[from]);
                if (words[from].equals(target)) {   // 현재 단계 단어가 target 과 일치
                    return step;
                }

                for (int to : graph.get(from)) {
                    if (!visited[to]) {             // 아직 확인하지 않은 단어일 경우
                        q.offer(to);
                        visited[to] = true;
                    }
                }
            }
            step++;
        }

        return step;
    }
}
