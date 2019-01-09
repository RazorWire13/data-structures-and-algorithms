package graphs;

import java.util.*;

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
        Edge edgeOne = new Edge(node2, weight);
        Edge edgeTwo = new Edge(node1, weight);
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

//    public static Iterable<Node> breadthFirstTraversal(Node startNode) {
//        LinkedList<Node> answer = new LinkedList<>();
//        //keep track of nodes to visit
//        Queue<Node> nodesToVisit = new LinkedList<>();
//        nodesToVisit.add(startNode);
//        // keep track of visited nodes
//        HashSet<Node> visitedNodes = new HashSet<>();
//        visitedNodes.add(startNode);
//
//        while(!nodesToVisit.isEmpty()) {
//            // take first ting out of queue
//            // add its neighbors to the queue if they haven't been seen yet
//            Node currentNode = nodesToVisit.poll();
//            answer.add(currentNode);
//            for (Edge neighbor : (Set<Edge>) currentNode.neighbors) {
//                Node neighborNode = neighbor.node;
//                if(!visitedNodes.contains(neighborNode)) {
//                    nodesToVisit.add(neighborNode);
//                    visitedNodes.add(neighborNode);
//                }
//            }
//        }
//    }
}
