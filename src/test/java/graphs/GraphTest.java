package graphs;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void addEdgeTest() {
        Graph<String> testGraph = new Graph<>();
        Node<String> node1 = testGraph.addVertex("a");
        Node<String> node2 = testGraph.addVertex("b");
        testGraph.addEdge(node1, node2, 2);
    }

    @Test
    public void addVertexTest() {
        Graph testGraph = new Graph<>();
        Node nodeA = testGraph.addVertex("a");
        Node nodeB = testGraph.addVertex("b");
        assertEquals("should contain a value of 'a'", "a", nodeA.value);
        assertEquals("size should be 2", 2, testGraph.size());
        assertEquals("node returned equals expected", nodeA, testGraph.nodes.iterator().next());
    }

    @Test
    public void getNodesTest() {
        Graph testGraph = new Graph<>();
        Node nodeA = testGraph.addVertex("a");
        Node nodeB = testGraph.addVertex("b");
        Node nodeC = testGraph.addVertex("c");
        assertNotNull("not null", testGraph.getNodes());

    }

    @Test
    public void getNeighborsTest() {
        Graph testGraph = new Graph<>();
        Node nodeA = testGraph.addVertex("a");
        Node nodeB = testGraph.addVertex("b");
        Node nodeC = testGraph.addVertex("c");
        testGraph.addEdge(nodeA, nodeB, 1);
        testGraph.addEdge(nodeA, nodeC, 2);
        assertEquals("neighbors of nodeA should be nodeB and nodeC", "b, c", testGraph.getNeighbors(nodeA));
    }

    @Test
    public void sizeTest() {
        Graph testGraph = new Graph<>();
        Node nodeA = testGraph.addVertex("a");
        Node nodeB = testGraph.addVertex("b");
        Node nodeC = testGraph.addVertex("c");
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
        Set<String> expected = new HashSet<>();
        expected.add(" a");
        expected.add(" b");
        expected.add(" c");
        expected.add(" d");
        expected.add(" e");
        expected.add(" f");
        expected.add(" g");
        expected.add(" h");
        assertEquals("should equal 8", 8, testGraph.size());
        assertEquals("actual should equal expected", expected, testGraph.breadthFirstTraversal(nodeA));
    }

    @Test
    public void depthFirstTest() {
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
        Set<String> expected = new HashSet<>();
        expected.add(" a");
        expected.add(" b");
        expected.add(" c");
        expected.add(" d");
        expected.add(" e");
        expected.add(" f");
        expected.add(" g");
        expected.add(" h");
        assertEquals("should equal 8", 8, testGraph.size());
        assertEquals("actual should equal expected", expected, testGraph.depthFirstTraversal(nodeA));
    }
}