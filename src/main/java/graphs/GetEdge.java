package graphs;

import java.util.HashSet;
import java.util.Set;

public class GetEdge {

    public static String flightPath(Graph graph, String[] cities) {
        if (cities.length <= 0) { return "False, $0"; }

        Node originCity = null;
        Set<Edge> neighbors;
        int cost = 0;
        boolean directFlight = false;

        for (Node node : (HashSet<Node>) graph.nodes) {
            if (node.value == cities[0]) {
                originCity = node;
            }
        }
        if (originCity == null) {
            return "False, $0";
        }
        for (int i = 1; i < cities.length; i++) {
            neighbors = originCity.neighbors;
            for (Edge edge : neighbors) {
                if (edge.node.value == cities[i]) {
                    cost += edge.weight;
                    originCity = edge.node;
                    directFlight = true;
                    System.out.println(originCity.value + " " + cost);
                }
            }
            if (directFlight) {
                directFlight = false;
            } else {
                return "False, $0";
            }
        }
        return "True, $" + cost;
    }
}
