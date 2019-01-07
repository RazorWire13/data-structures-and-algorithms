package graphs;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {

    public HashMap<String, Node> vertices;
    public HashMap<Integer, Edge> edges;

    public Graph() {
        this.vertices = new HashMap<String, Node>();
        this.edges = new HashMap<Integer, Edge>();
    }

    public static void main(String[] args) {
        Graph testGraph = new Graph();
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        testGraph.addEdge(a, b,2);
        testGraph.addEdge(a, c,1);
        testGraph.addEdge(b, c,3);

    }

    public void addEdge(Node node1, Node node2, int weight) {
          Edge edgeOne = new Edge(node2, 2);
          Edge edgeTwo = new Edge(node1, 2);
          node1.neighbors.add(edgeOne);
          node2.neighbors.add(edgeTwo);
    }

    public void addVertex()

    public HashMap getNodes() {

    }

    public HashSet getNeighbors() {

    }

    public int size() {

    }

}
