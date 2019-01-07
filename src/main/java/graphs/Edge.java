package graphs;

public class Edge {
    protected Node destination;
    protected int weight;

    public Edge (Node destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }
}
