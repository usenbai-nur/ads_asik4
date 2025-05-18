import java.util.*;

public class DS<T> {
    public Map<Vertex<T>, Double> dijkstra(Vertex<T> start) {
        Map<Vertex<T>, Double> distances = new HashMap<>();
        PriorityQueue<VertexDistance<T>> pq = new PriorityQueue<>();

        for (Vertex<T> v : start.getAdjacentVertices().keySet()) {
            distances.put(v, Double.POSITIVE_INFINITY);
        }
        distances.put(start, 0.0);
        pq.add(new VertexDistance<>(start, 0.0));

        while (!pq.isEmpty()) {
            VertexDistance<T> current = pq.poll();
            Vertex<T> currentVertex = current.vertex;

            for (Map.Entry<Vertex<T>, Double> entry : currentVertex.getAdjacentVertices().entrySet()) {
                Vertex<T> neighbor = entry.getKey();
                double newDist = distances.get(currentVertex) + entry.getValue();
                if (newDist < distances.getOrDefault(neighbor, Double.POSITIVE_INFINITY)) {
                    distances.put(neighbor, newDist);
                    pq.add(new VertexDistance<>(neighbor, newDist));
                }
            }
        }

        return distances;
    }

    private static class VertexDistance<T> implements Comparable<VertexDistance<T>> {
        Vertex<T> vertex;
        double distance;

        VertexDistance(Vertex<T> vertex, double distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(VertexDistance<T> o) {
            return Double.compare(this.distance, o.distance);
        }
    }
}
