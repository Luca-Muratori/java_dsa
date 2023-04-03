import java.util.*;

public class GraphNodeList {
    public String name;
    public int index;

    public ArrayList<GraphNodeList> neighbors=new ArrayList<GraphNodeList>();

    public void GraphNode(String name, int index){
        this.name=name;
        this.index=index;
    }
}
