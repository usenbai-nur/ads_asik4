import java.util.Map;

public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>();

        graph.addVertex("astana");
        graph.addVertex("turkestan");
        graph.addVertex("pavlodar");
        graph.addVertex("zhanaozen");

        graph.addEdge("astana", "turkestan", 1);
        graph.addEdge("astana", "pavlodar", 4);
        graph.addEdge("turkestan", "pavlodar", 2);
        graph.addEdge("pavlodar", "zhanaozen", 1);

        Vertex<String> start = graph.getVertex("astana");

        System.out.println("BFS from astana:");
        new BFS<String>().bfs(start);

        System.out.println("Dijkstra from astana:");
        Map<Vertex<String>, Double> distances = new DS<String>().dijkstra(start);
        for (Map.Entry<Vertex<String>, Double> entry : distances.entrySet()) {
            System.out.println("Distance to " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
