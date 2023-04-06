import java.util.*;

public class WeightedGraph {
    ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();

    public WeightedGraph(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void dijkstra(WeightedNode node) {
        PriorityQueue<WeightedNode> queue = new PriorityQueue<WeightedNode>();
        node.distance = 0;

        queue.addAll(nodeList);
        while (!queue.isEmpty()) {
            WeightedNode currentNode = queue.remove();
            for (WeightedNode neighbor : currentNode.neighbors) {
                if (queue.contains(neighbor)) {
                    if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
                        neighbor.distance = currentNode.distance + currentNode.weightMap.get(neighbor);
                        neighbor.parent = currentNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.println("Node: " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
            pathPrint(nodeToCheck);
        }
    }

    public static void pathPrint(WeightedNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.println(node.name + " ");
    }

    public void addWeightEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbors.add(second);
        first.weightMap.put(second, d);
    }

    public void bellaman(WeightedNode sourceNode) {
        sourceNode.distance = 0;
        for (int i = 0; i < nodeList.size(); i++) {
            for (WeightedNode currentNode : nodeList) {
                for (WeightedNode neighbor : currentNode.neighbors) {
                    if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
                        neighbor.distance = (currentNode.distance + currentNode.weightMap.get(neighbor));
                        neighbor.parent = currentNode;
                    }
                }
            }
        }
        System.out.println("Checking for negative cycle");
        for (WeightedNode currentNode : nodeList) {
            for (WeightedNode neighbor : currentNode.neighbors) {
                if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
                    System.out.println("Negative cycle found: ");
                    System.out.println("vertex name: " + neighbor.name);
                    System.out.println("old cost: " + neighbor.distance);
                    int newDistance = currentNode.distance + currentNode.weightMap.get(neighbor);
                    System.out.println("new cost: " + newDistance);
                    return;
                }
            }
        }
        System.out.println("negative cycle not found");
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.println("Node: " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
            pathPrint(nodeToCheck);
        }
    }

    public void floy() {
        int size = nodeList.size();
        int[][] v = new int[size][size];
        for (int i = 0; i < size; i++) {
            WeightedNode first = nodeList.get(i);
            for (int j = 0; j < size; j++) {
                WeightedNode second = nodeList.get(j);
                if (i == j) {
                    v[i][j] = 0;
                } else if (first.weightMap.containsKey(second)) {
                    v[i][j] = first.weightMap.get(second);
                } else {
                    v[i][j] = Integer.MAX_VALUE / 10;
                }
            }
        }
        for (int k = 0; k < nodeList.size(); k++) {
            for (int i = 0; i < nodeList.size(); i++) {
                for (int j = 0; j < nodeList.size(); j++) {
                    if (v[i][j] > v[i][k] + v[k][j]) {
                        v[i][j] = v[i][k] + v[k][j];
                    }
                }
            }
        }
        for (int i = 0; i <size; i++) {
            System.out.println("Printing distance for node " + nodeList.get(i) + ":");
            for (int j = 0; j < size; j++) {
                System.out.println(v[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
