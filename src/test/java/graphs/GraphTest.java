package graphs;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void addVertexTest() {
        Graph testGraphAdd = new Graph<>();
        Node nodeA = testGraphAdd.addVertex("a");
        Node nodeB = testGraphAdd.addVertex("b");

        assertEquals("size should be 2", 2, testGraphAdd.size());

        Node nodeC = testGraphAdd.addVertex("c");

        assertEquals("should contain a value of 'c'", "c", nodeC.value);
        assertEquals("size should be 3 after adding new vertex", 3, testGraphAdd.size());
    }

    @Test
    public void getNodesTest() {
        Graph testGraph = new Graph<>();
        Node nodeA = testGraph.addVertex("a");
        Node nodeB = testGraph.addVertex("b");
        Node nodeC = testGraph.addVertex("c");

        assertNotNull("not null", testGraph.getNodes());
        assertEquals("Size of graph is 3", 3, testGraph.size());
        assertNotEquals("Size of graph is not 5", 5, testGraph.size());
    }

    @Test
    public void getNeighborsTest() {
        Graph testGraph = new Graph<>();
        Node nodeA = testGraph.addVertex("a");
        Node nodeB = testGraph.addVertex("b");
        Node nodeC = testGraph.addVertex("c");
        Node nodeD = testGraph.addVertex("d");
        Node nodeE = testGraph.addVertex("e");
        testGraph.addEdge(nodeA, nodeB, 1);
        testGraph.addEdge(nodeA, nodeC, 1);
        testGraph.addEdge(nodeC, nodeD, 1);
        testGraph.addEdge(nodeC, nodeE, 1);

        assertEquals("neighbors of nodeA should equal 2", 2, testGraph.getNeighbors(nodeA).size());
        assertEquals("neighbors of nodeA should equal 1", 1, testGraph.getNeighbors(nodeB).size());
        assertEquals("neighbors of nodeA should equal 3", 3, testGraph.getNeighbors(nodeC).size());
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

    // breadthFirstTest SAYS IT DOESN'T WORK, BUT IT IS IDENTICAL IN THE FAILURE MESSAGE
    @Test
    public void breadthFirstTest() {
        Graph testGraph = new Graph<>();
        Node nodeA = testGraph.addVertex("a");
        Node nodeB = testGraph.addVertex("b");
        Node nodeC = testGraph.addVertex("c");
        Node nodeD = testGraph.addVertex("d");

        nodeA.addEdge(nodeB);
        nodeA.addEdge(nodeD);
        nodeB.addEdge(nodeC);

        List<String> expected = new LinkedList<>();
        expected.add(" a");
        expected.add(" d");
        expected.add(" b");
        expected.add(" c");

        assertEquals("should equal 4", 4, testGraph.size());
        assertNotEquals("should NOT equal 7", 7, testGraph.size());
        assertEquals("actual should equal expected", expected, testGraph.breadthFirstTraversal(nodeA));
    }

    // depthFirstTest SAYS IT DOESN'T WORK, BUT IT IS IDENTICAL IN THE FAILURE MESSAGE
    @Test
    public void depthFirstTest() {
        Graph testGraph = new Graph<>();
        Node nodeA = testGraph.addVertex("a");
        Node nodeB = testGraph.addVertex("b");
        Node nodeC = testGraph.addVertex("c");
        Node nodeD = testGraph.addVertex("d");
        Node nodeE = testGraph.addVertex("e");

        nodeA.addEdge(nodeB);
        nodeA.addEdge(nodeD);
        nodeB.addEdge(nodeC);
        nodeC.addEdge(nodeE);

        List<String> expected = new LinkedList<>();
        expected.add(" a");
        expected.add(" d");
        expected.add(" b");
        expected.add(" c");
        expected.add(" e");

        assertEquals("should equal 5", 5, testGraph.size());
        assertNotEquals("should NOT equal 1", 1, testGraph.size());
        assertEquals("actual should equal expected", expected, testGraph.depthFirstTraversal(nodeA));
    }
}