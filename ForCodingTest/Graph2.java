
import java.util.ArrayList;

// 기준 노드에서 해당 노트까지의 거리 정보
class NodeInfo {
    private int index;
    private int distance;

    public NodeInfo(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public void show() {
        System.out.println("(" + this.index + ", " + this.distance + ") ");
    }
}

public class Graph2 {
    // 행이 3개인 인접 리스트 표현
    public static ArrayList<ArrayList<NodeInfo>> graph = new ArrayList<>();

    public static void main(String[] args) {
        // 그래프 초기화 (선언시에는 ArrayList 타입의 참조변수일 뿐이기 때문에 실제 객체로 초기화해줘야 함)
        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<>());
        }

        // 노드 0에 연결된 노드 정보 저장 (노드, 거리)
        graph.get(0).add(new NodeInfo(1, 7));
        graph.get(0).add(new NodeInfo(2, 5));

        // 노드 1에 연결된 노드 정보 저장
        graph.get(1).add(new NodeInfo(0, 7));

        // 노드 2에 연결된 노드 정보 저장
        graph.get(2).add(new NodeInfo(0, 5));

        for (int i = 0; i < graph.size(); i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                graph.get(i).get(j).show();
            }
            System.out.println();
        }
    }
}
