import java.util.*;

public class GraphList {
    ArrayList<GraphNodeList> nodeList=new ArrayList<GraphNodeList>();

    public void Graph(ArrayList<GraphNodeList> nodeList){
        this.nodeList=nodeList;
    }

    public void addUndirectedEdges(int i, int j){
        GraphNodeList first= nodeList.get(i);
        GraphNodeList second= nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);


    }
}
