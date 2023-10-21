import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class NodePathFinder {
    public static Node getLowestFCost(LinkedList<Node> open, Node start, Node end) {
        if (open.isEmpty()) {
            return null; // Handle the case where the list is empty
        }
        int saveI = 0;
        double fCost = open.get(0).getCost(start) + open.get(0).getCost(end);  //getDistanceToStartPlusEnd(open.get(0), start, end);
        for (int i = 1; i < open.size(); i++) {
            double currentFCost = open.get(i).getCost(start) + open.get(i).getCost(end);
            if (currentFCost < fCost) {
                fCost = currentFCost;
                saveI = i;
            }
        }
        return open.get(saveI);
    }

    public static LinkedList<Node> returnPath(Node node, Map<Node, Node> parents){
        LinkedList<Node> pathList = new LinkedList<>();
        Node current = node;
        while (current != null) {
            pathList.addFirst(current);
            current = parents.get(current);
        }
        printPath(pathList);
        return pathList;
    }
    public static void printPath(LinkedList<Node> pathList){
        for (int i = 0; i <= pathList.size() - 1; i++) {
            System.out.print(pathList.get(i).getName()+", ");
        }
        System.out.println();
    }
    public static LinkedList<Node> getPath(Node start, Node end){
        LinkedList<Node> nodesCanGoTo = new LinkedList<Node>();
        LinkedList<Node> closed = new LinkedList<Node>();
        Map<Node, Node> parents = new HashMap<>();
        nodesCanGoTo.add(start);

        while (!nodesCanGoTo.isEmpty()) {
            Node current = getLowestFCost(nodesCanGoTo, start, end);
            nodesCanGoTo.remove(current);
            closed.add(current);

            if (current.getName() == end.getName()) {
                return returnPath(current, parents);
            }

            for (Node neighbor : current.getNeighbors()) {
                if (!closed.contains(neighbor) && !nodesCanGoTo.contains(neighbor) ) { //!isInList(neighbor, closed) && !isInList(neighbor, nodesCanGoTo)
                    nodesCanGoTo.add(neighbor);
                    parents.put(neighbor, current);
                }
            }
        }
        return null;
    }
}
