public class Fractional {
    private int index;
    private int value;
    private int weight;
    private double ratio;

    public Fractional(int index, int value, int weight) {
        this.index = index;
        this.value = value;
        this.weight = weight;
        this.ratio = value * 1.0 / weight;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeigth() {
        return weight;
    }

    public void setWeigth(int weight) {
        this.weight = weight;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    @Override
    public String toString() {
        return "Item index= " + index + ", value: " + value + ", weigth " + weight + ", ratio: " + ratio;
    }
}
