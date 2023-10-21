package interfaces;

import java.util.LinkedList;
import java.util.List;

public interface Node {
    String getName();

    List<Edge> getEdges();

    void addEdges(Edge edge);

    Comparator getComparator();

    default double getCost(Node node) {
        return getComparator().getCost(this, node);
    }

    default List<Node> getNeighbors() {
        LinkedList<Node> neighbors = new LinkedList<>();
        for (Edge edge : getEdges()) {
            neighbors.add(edge.getOtherNode(this));
        }
        return neighbors;
    }

}