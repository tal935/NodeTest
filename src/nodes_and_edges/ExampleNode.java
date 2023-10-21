package nodes_and_edges;

import interfaces.Comparator;
import interfaces.Node;
import interfaces.Edge;

import java.util.LinkedList;
import java.util.List;

public class ExampleNode implements Node {
    String name;
    List<Edge> edges = new LinkedList<>();
    private double value;

    public ExampleNode(String name, double value) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Edge> getEdges() {
        return edges;
    }

    @Override
    public void addEdges(Edge edge) {
        edges.add(edge);
    }

    @Override
    public Comparator<ExampleNode> getComparator() {
        return (ExampleNode exampleNode1, ExampleNode exampleNode2) -> Math.pow(Math.abs(exampleNode1.value - exampleNode2.value), 2);
    }

    public double getValue() {
        return value;
    }
}
