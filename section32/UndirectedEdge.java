public class UndirectedEdge {
    public WeightedNode first;
    public WeightedNode second;
    public int weight;

    public UndirectedEdge(WeightedNode first, WeightedNode second, int weight){
        this.first=first;
        this.weight=weight;
        this.second=second;
    }

    @Override
    public String toString(){
        return "edge (" + first + ", " + second + "), weight= "+ weight; 
    }
}
