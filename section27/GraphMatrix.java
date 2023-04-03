import java.util.*;

public class GraphMatrix {
    ArrayList<GraphNode> nodeList=new ArrayList<GraphNode>();
    int [][] adjacencyMatrix;

    public  GraphMatrix(ArrayList<GraphNode> nodeList){
        this.nodeList=nodeList;
        adjacencyMatrix=new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdges(int i, int j){
        adjacencyMatrix[i][j]=1;
        adjacencyMatrix[j][i]=1;
    }


}
