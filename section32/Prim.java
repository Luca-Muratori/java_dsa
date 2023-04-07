import java.util.*;

public class Prim {
    ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();
    ArrayList<UndirectedEdge> edgeList = new ArrayList<UndirectedEdge>();

    public Prim(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addWeightUndirectedEdge(int firstIndex, int secondIndex, int weight) {
        UndirectedEdge edge = new UndirectedEdge(nodeList.get(firstIndex), nodeList.get(secondIndex), weight);
        WeightedNode first = edge.first;
        WeightedNode second = edge.second;
        first.neighbors.add(second);
        second.neighbors.add(first);
        first.weightMap.put(second, weight);
        second.weightMap.put(first, weight);
        edgeList.add(edge);
    }

    void prim(WeightedNode node) {
        for (int i = 0; i < nodeList.size(); i++) {
            nodeList.get(i).distance = Integer.MAX_VALUE;
        }

        node.distance = 0;
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        queue.addAll(nodeList);
        while (!queue.isEmpty()) {
            WeightedNode currentNode = queue.remove();
            for (WeightedNode neighbor : currentNode.neighbors) {
                if (queue.contains(neighbor)) {
                    if (neighbor.distance > currentNode.weightMap.get(neighbor)) {
                        neighbor.distance = currentNode.weightMap.get(neighbor);
                        neighbor.parent = currentNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }

        int cost = 0;
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.println(
                    "node " + nodeToCheck + " , key" + nodeToCheck.distance + " Parent: " + nodeToCheck.parent);
            cost = cost + nodeToCheck.distance;
        }
        System.out.println("TOtal cost of minimum spanning tree: " + cost);
    }
}
