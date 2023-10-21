package interfaces;

public abstract class Edge<T extends Node> {
    private T node1;
    private T node2;

    public Edge(T node1, T node2) {
        this.node1 = node1;
        this.node2 = node2;
        node1.addEdges(this);
        node2.addEdges(this);
    }

    public T getNode1() {
        return node1;
    }

    public T getNode2() {
        return node2;
    }

    public T getOtherNode(Node node) {
        if (node == node1) {
            return node2;
        }
        return node1;
    }
}
