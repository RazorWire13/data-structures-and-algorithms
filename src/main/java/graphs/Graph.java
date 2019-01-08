package graphs;

import java.util.HashSet;
import java.util.Set;

public class Graph<T> {
    public Set<Node<T>> nodes;

    public Graph() {
        this.nodes = new HashSet<>();
    }

    public static void main(String[] args) {
        Graph<String> testGraph = new Graph<>();
        Node<String> node1 = testGraph.addVertex("a");
        Node<String> node2 = testGraph.addVertex("b");
        Node<String> node3 = testGraph.addVertex("c");
        testGraph.addEdge(node1, node2, 1);
        testGraph.addEdge(node1, node3, 2);
    }

    public void addEdge(Node<T> node1, Node<T> node2, int weight) {
        Edge edgeOne = new Edge(node2, 2);
        Edge edgeTwo = new Edge(node1, 2);
        node1.neighbors.add(edgeOne);
        node2.neighbors.add(edgeTwo);
    }

    public Node<T> addVertex(T value) {
        Node<T> newVertex = new Node<>(value);
        nodes.add(newVertex);
        return newVertex;
    }

    public Set<Node<T>> getNodes() {
        return this.nodes;
    }

    public Set<Edge<T>> getNeighbors(Node node) {
        if (!this.nodes.contains(nodes)) {
            throw new IllegalArgumentException("Node not in graph");
        }
        return node.neighbors;
    }

    public int size() {
        return this.nodes.size();
    }

//    public Set<Node> breadthFirstTraversal(Graph graph, Node<T> node) {
//        List<Node> visited = new ArrayList<>();
//        Set<Node> nodeList = graph.getNeighbors(node);
//        for (Node node : nodeList) {
//            visited = node.neighbors;
//            for (Node node : visited) {
//                if (!nodeList.contains(node)) {
//                    nodeList.add(node);
//                }
//            }
//        }
//    }
}
