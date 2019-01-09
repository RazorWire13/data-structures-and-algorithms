package graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void addEdgeTest() {
        Graph<String> testGraph = new Graph<>();
        Node<String> node1 = testGraph.addVertex("a");
        Node<String> node2 = testGraph.addVertex("b");
        testGraph.addEdge(node1, node2,2);
    }

    @Test
    public void addVertexTest() {
        Graph<String> testGraph = new Graph<>();
        Node<String> node1 = testGraph.addVertex("a");
        Node<String> node2 = testGraph.addVertex("b");
        assertEquals("should contain a value of 'a'", "a", node1.value);
        assertEquals("size should be 2", 2, testGraph.size());
        assertEquals("node returned equals expected", node1, testGraph.nodes.iterator().next());
    }

    @Test
    public void getNodesTest() {
        Graph<String> testGraph = new Graph<>();
        Node<String> node1 = testGraph.addVertex("a");
        Node<String> node2 = testGraph.addVertex("b");
        Node<String> node3 = testGraph.addVertex("c");
        assertNotNull("not null", testGraph.getNodes());

    }

    @Test
    public void getNeighborsTest() {
        Graph<String> testGraph = new Graph<>();
        Node<String> node1 = testGraph.addVertex("a");
        Node<String> node2 = testGraph.addVertex("b");
        Node<String> node3 = testGraph.addVertex("c");
        testGraph.addEdge(node1, node2, 1);
        testGraph.addEdge(node1, node3, 2);
        testGraph.getNeighbors(node1);

    }

    @Test
    public void sizeTest() {
        Graph<String> testGraph = new Graph<>();
        Node<String> node1 = testGraph.addVertex("a");
        Node<String> node2 = testGraph.addVertex("b");
        Node<String> node3 = testGraph.addVertex("c");
        assertEquals("should equal 3", 3, testGraph.size());
        assertNotEquals("should not equal 2", 2, testGraph.size());
    }

    @Test
    public void sizeTest_null() {
        Graph<String> testGraph = new Graph<>();
        Node<String> node1 = testGraph.addVertex("a");
        assertNotNull("not equal null", testGraph.size());
    }

    @Test
    public void breadthFirstTest() {
        Graph<String> testGraph = new Graph<>();
        Node<String> node1 = testGraph.addVertex("a");
        Node<String> node2 = testGraph.addVertex("b");
        Node<String> node3 = testGraph.addVertex("c");
        Node<String> node4 = testGraph.addVertex("d");
        Node<String> node5 = testGraph.addVertex("e");
        Node<String> node6 = testGraph.addVertex("f");
        testGraph.addEdge(node1, node2, 1);
        testGraph.addEdge(node2, node3, 1);
        testGraph.addEdge(node2, node4, 1);
        testGraph.addEdge(node3, node5, 1);
        testGraph.addEdge(node3, node6, 1);
        testGraph.addEdge(node4, node6, 1);
        assertEquals("should equal 6", 6, testGraph.size());
    }
//    @Test
//    public void breadthFirstTest() {
//        Graph<String> testGraph = new Graph<>();
//        Node<String> node1 = testGraph.addVertex("a");
//        Node<String> node2 = testGraph.addVertex("b");
//        Node<String> node3 = testGraph.addVertex("c");
//        Node<String> node4 = testGraph.addVertex("d");
//
//
}