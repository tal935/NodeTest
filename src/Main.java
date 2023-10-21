import interfaces.Edge;
import nodes_and_edges.ExampleEdge;
import nodes_and_edges.ExampleNode;

public class Main {
    public static void main(String[] args) {
        ExampleNode node1 = new ExampleNode("node1", 1);
        ExampleNode node2 = new ExampleNode("node2", 5);
        ExampleNode node3 = new ExampleNode("node3", 1);
        ExampleNode node4 = new ExampleNode("node4", -1);

        ExampleEdge edge1 = new ExampleEdge(node1, node2);
        ExampleEdge edge2 = new ExampleEdge(node3, node2);
        ExampleEdge edge3 = new ExampleEdge(node3, node4);
        ExampleEdge edge4 = new ExampleEdge(node1, node4);

        NodePathFinder.getPath(node3, node1);
    }
}