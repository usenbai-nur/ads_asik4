import java.util.*;

public class WeightedGraph<T> {
    private Map<T, Vertex<T>> vertices = new HashMap<>();

    public void addVertex(T data) {
        vertices.putIfAbsent(data, new Vertex<>(data));
    }

    public void addEdge(T source, T destination, double weight) {
        Vertex<T> src = vertices.get(source);
        Vertex<T> dest = vertices.get(destination);
        if (src != null && dest != null) {
            src.addAdjacentVertex(dest, weight);
        }
    }

    public Vertex<T> getVertex(T data) {
        return vertices.get(data);
    }

    public Collection<Vertex<T>> getAllVertices() {
        return vertices.values();
    }
}
