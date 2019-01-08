package graphs;

public class Edge<T> {
    protected Node<T> node;
    protected int weight;

    public Edge(Node<T> node) {
        this(node,1);
    }

    public Edge(Node<T> node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}
