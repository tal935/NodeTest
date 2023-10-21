import java.util.List;

public interface Node {
    NodeComparator getComparator();
    String getName();
    List<Node> getNeighbors();
    void addNeighbor(Node neighbor);
    default double getCost(Node neighbor) {
        return getComparator().getCost(this, neighbor);
    }
}