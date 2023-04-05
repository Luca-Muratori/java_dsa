import java.util.*;

public class GraphList {
    ArrayList<GraphNodeList> nodeList = new ArrayList<GraphNodeList>();

    public void Graph(ArrayList<GraphNodeList> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectedEdges(int i, int j) {
        GraphNodeList first = nodeList.get(i);
        GraphNodeList second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }

    


    public void bfsVisit(GraphNodeList node) {
        LinkedList<GraphNodeList> queue = new LinkedList<GraphNodeList>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNodeList currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.println(currentNode + " ");
            for (GraphNodeList neighbor : currentNode.neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    public void bfs() {
        for (GraphNodeList node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
    }

    public void dfsVisit(GraphNodeList node) {
        Stack<GraphNodeList> stack = new Stack<GraphNodeList>();
        stack.push(node);
        while (!stack.isEmpty()) {
            GraphNodeList currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.println(currentNode + " ");
            for (GraphNodeList neighbor : currentNode.neighbors) {
                if (!neighbor.isVisited) {
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    public void topologicalVisit(GraphNodeList node, Stack<GraphNodeList> stack){
        for(GraphNodeList neighbor:node.neighbors){
            if(!neighbor.isVisited){
                topologicalVisit(node, stack);
            }
        }
        node.isVisited=true;
        stack.push(node);
    }

    public void topologicalSort(){
        Stack<GraphNodeList> stack=new Stack<GraphNodeList>();
        for(GraphNodeList node: nodeList){
            if(!node.isVisited){
                topologicalVisit(node, stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop().name+" ");
        }
    }

   
}
