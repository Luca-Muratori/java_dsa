public class Knapsac {
    private int knapsac(int[] profits, int[] weights, int capacity, int currentIndex) {
        if (capacity <= 0 || currentIndex < 0 || currentIndex >= profits.length) {
            return 0;
        }
        int profit1 = 0;
        int profit2 = 0;
        if (weights[currentIndex] <= capacity) {
            profit1 = profits[currentIndex]
                    + knapsac(profits, weights, capacity - weights[currentIndex], currentIndex + 1);
        }
        profit2 = knapsac(profits, weights, capacity, currentIndex + 1);
        return Math.max(profit1, profit2);
    }

    public int knapsac(int[] profits, int[] weights, int capacity) {
        return this.knapsac(profits, weights, capacity, 0);
    }
}
