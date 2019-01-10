package graphs;

import java.util.*;

public class Graph<T> {
    public Set<Node<T>> nodes;

    public Graph() {
        this.nodes = new HashSet<>();
    }

    public static void main(String[] args) {
        Graph testGraph = new Graph<>();
        Node nodeA = testGraph.addVertex("a");
        Node nodeB = testGraph.addVertex("b");
        Node nodeC = testGraph.addVertex("c");
        Node nodeD = testGraph.addVertex("d");
        Node nodeE = testGraph.addVertex("e");
        Node nodeF = testGraph.addVertex("f");
        Node nodeG = testGraph.addVertex("g");
        Node nodeH = testGraph.addVertex("h");
        testGraph.addEdge(nodeA, nodeD, 1);
        testGraph.addEdge(nodeA, nodeB, 1);
        testGraph.addEdge(nodeB, nodeC, 1);
        testGraph.addEdge(nodeC, nodeG, 1);
        testGraph.addEdge(nodeD, nodeF, 1);
        testGraph.addEdge(nodeD, nodeE, 1);
        testGraph.addEdge(nodeE, nodeH, 1);
        testGraph.addEdge(nodeF, nodeH, 1);

        System.out.println("Breadth-first: " + testGraph.breadthFirstTraversal(nodeA).toString());

        System.out.println("Depth-first: " + testGraph.depthFirstTraversal(nodeA).toString());
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

    public static Iterable<Node> breadthFirstTraversal(Node startNode) {
        LinkedList<Node> answer = new LinkedList<>();
        //keep track of nodes to visit
        Queue<Node> nodesToVisit = new LinkedList<>();
        nodesToVisit.add(startNode);
        // keep track of visited nodes
        HashSet<Node> visitedNodes = new HashSet<>();
        visitedNodes.add(startNode);

        while(!nodesToVisit.isEmpty()) {
            // take first ting out of queue
            // add its neighbors to the queue if they haven't been seen yet
            Node currentNode = nodesToVisit.poll();
            answer.add(currentNode);
            for (Edge neighbor : (Set<Edge>) currentNode.neighbors) {
                Node neighborNode = neighbor.node;
                if(!visitedNodes.contains(neighborNode)) {
                    nodesToVisit.add(neighborNode);
                    visitedNodes.add(neighborNode);
                }
            }
        }
        return answer;
    }

    public static Iterable<Node> depthFirstTraversal(Node startNode) {
        LinkedList<Node> answer = new LinkedList<>();
        //keep track of nodes to visit
        Stack<Node> nodesToVisit = new Stack<>();
        nodesToVisit.add(startNode);
        // keep track of visited nodes
        HashSet<Node> visitedNodes = new HashSet<>();
        visitedNodes.add(startNode);

        while(!nodesToVisit.isEmpty()) {
            // take first ting out of queue
            // add its neighbors to the queue if they haven't been seen yet
            Node currentNode = nodesToVisit.pop();
            answer.add(currentNode);
            for (Edge neighbor : (Set<Edge>) currentNode.neighbors) {
                Node neighborNode = neighbor.node;
                if(!visitedNodes.contains(neighborNode)) {
                    nodesToVisit.add(neighborNode);
                    visitedNodes.add(neighborNode);
                }
            }
        }
        return answer;
    }
}
