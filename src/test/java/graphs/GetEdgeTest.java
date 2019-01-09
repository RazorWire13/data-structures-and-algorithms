package graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {

    @Test
    public void flightPath() {
        Graph testGraph = new Graph<>();
        Node nodeA = testGraph.addVertex("a");
        Node nodeB = testGraph.addVertex("b");
        Node nodeC = testGraph.addVertex("c");
        Node nodeD = testGraph.addVertex("d");
        testGraph.addEdge(nodeA, nodeB, 1);
        testGraph.addEdge(nodeB, nodeC, 2);
        testGraph.addEdge(nodeB, nodeD, 3);
        String[] citiesFalse = {"a", "b", "c", "d"};
        String[] citiesTrue = {"a", "b", "c"};
        String[] citiesEmpty = {};
        String[] citiesSolo = {"a"};

        assertEquals("flightPath will return False, $0", "False, $0", GetEdge.flightPath(testGraph, citiesFalse));

        assertEquals("flightPath will return True, $3", "True, $3", GetEdge.flightPath(testGraph, citiesTrue));

        assertEquals("flightPath will return False, $0", "False, $0", GetEdge.flightPath(testGraph, citiesEmpty));

        assertEquals("flightPath will return True, $0", "True, $0", GetEdge.flightPath(testGraph, citiesSolo));
    }
}