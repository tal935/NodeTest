package nodes_and_edges;

import interfaces.Comparator;
import interfaces.Edge;
import interfaces.Node;

import java.util.LinkedList;
import java.util.List;

public class RobotNode implements Node {


    List<Edge> edges = new LinkedList<>();
    private double X;
    private double Y;
    private boolean IntakeOpen;

    public RobotNode() {
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public List<Edge> getEdges() {
        return null;
    }

    @Override
    public void addEdges(Edge edge) {

    }

    @Override
    public Comparator<RobotNode> getComparator() {
        return (RobotNode n, RobotNode n2) ->  Math.hypot(n.X-n2.X,n.Y-n2.Y) + ((n.IntakeOpen==n2.IntakeOpen) ? 0:30);
    }
}
