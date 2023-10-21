import java.util.LinkedList;
import java.util.List;

public class ExampleNode implements Node{
    String name;
    List<Node> neighbors = new LinkedList<Node>();
    private double value;

    public ExampleNode(String name, double value){
        this.value = value;
        this.name = name;
    }

    @Override
    public NodeComparator<ExampleNode> getComparator() {
        return (ExampleNode exampleNode1,ExampleNode exampleNode2)-> Math.pow(Math.abs(exampleNode1.value - exampleNode2.value),2);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Node> getNeighbors() {
        return neighbors;
    }

    @Override
    public void addNeighbor(Node neighbor) {
        neighbors.add(neighbor);
    }
}
