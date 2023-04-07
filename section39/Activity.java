public class Activity {
    private String name;
    private int start;
    private int finish;

    public Activity(String name, int start, int end){
        this.start=start;
        this.finish=end;
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getStart(){
        return start;
    }

    public void setStart(int start){
        this.start=start;
    }

    public int getFinish(){
        return finish;
    }

    public void setFinish(int finish){
        this.finish=finish;
    }

    @Override
    public String toString(){
        return "Activity: " + name +", start time:" + start + ", finish time: " + finish; 
    }
}
