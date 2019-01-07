package graphs;

import java.util.HashSet;
import java.util.Set;

public class Node {
    protected String value;
    protected Set<Edge> neighbors;

    public Node(String value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }

}
