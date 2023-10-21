public class Main {
    public static void main(String[] args) {
        ExampleNode node1 = new ExampleNode("node1",1);
        ExampleNode node2 = new ExampleNode("node2",5);
        ExampleNode node3 = new ExampleNode("node3",20);

        node1.addNeighbor(node2);
        node2.addNeighbor(node3);


        System.out.println(node1.getCost(node3));
        System.out.println(node1.getCost(node2)+node2.getCost(node3));

        NodePathFinder.getPath(node1,node3);
    }
}