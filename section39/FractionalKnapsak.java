import java.util.*;

public class FractionalKnapsak {
    static void knapSack(ArrayList<Fractional> items, int capacity) {
        Comparator<Fractional> comparator = new Comparator<Fractional>() {
            @Override
            public int compare(Fractional o1, Fractional o2) {
                if (o2.getRatio() > o1.getRatio()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(items, comparator);
        int usedCapacity = 0;
        double totalValue = 0;
        for (Fractional item : items) {
            if (usedCapacity + item.getWeigth() <= capacity) {
                usedCapacity += item.getWeigth();
                System.out.println("Taken: " + item);
                totalValue += item.getValue();
            } else {
                int usedWeight = capacity - usedCapacity;
                double value = item.getRatio() * usedWeight;
                System.out.println("taken: item index " + item.getIndex() + ", obtained value= " + value
                        + ", used weight=" + usedWeight + ", ratio= " + item.getRatio());
                usedCapacity += usedWeight;
                totalValue += value;
            }
            if (usedCapacity == capacity) {
                break;
            }
            System.out.println("total value obtained" + totalValue);
        }
    }
}
