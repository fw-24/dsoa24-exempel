import java.util.ArrayList;
import java.util.HashMap;

public class Graphy {

    private HashMap<String, Node> graph = new HashMap<>();

    private static class Node {
        private ArrayList<Node> edges = new ArrayList<>();
        String key, value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
            edges = new ArrayList<>();
        }
    }

    public void addEdge(String nodeKey, String edgeKey) {

    }

    public void createNode(String key, String value) {
        Node n = new Node(key, value);
        graph.put(key, n);
    }


    public void printGraph() {
        System.out.println("Graph:");
        for (String key: graph.keySet()) {
            System.out.println(graph.get(key).value);
        }
        System.out.println("");
    }

}
