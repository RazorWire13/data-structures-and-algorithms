package graphs;

import java.util.HashSet;
import java.util.Set;

public class Node<T> {
    protected T value;
    protected Set<Edge<T>> neighbors;

    public Node() {
        this(null);
    }

    public Node(T value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    protected void addEdge(Node<T> neighbor, int weight) {
        Edge<T> newEdge = new Edge(neighbor, weight);
        this.neighbors.add(newEdge);
    }

    public String toString() {
        return " " + this.value;
    }
}
