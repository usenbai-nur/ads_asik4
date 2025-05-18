import java.util.HashMap;
import java.util.Map;

public class Vertex<T> {
    private T data;
    private Map<Vertex<T>, Double> adjacentVertices = new HashMap<>();

    public Vertex(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void addAdjacentVertex(Vertex<T> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }

    public Map<Vertex<T>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vertex)) return false;
        Vertex<?> other = (Vertex<?>) obj;
        return data.equals(other.data);
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }
}
