public class HouseRobber {
    private int maxMoneyRecursive(int[] housesNetWorth, int currentIndex){
        if(currentIndex>=housesNetWorth.length){
            return 0;
        }

        int stealCurrentHouse=housesNetWorth[currentIndex] + maxMoneyRecursive(housesNetWorth, currentIndex+2);
        int skipCurrentHouse=maxMoneyRecursive(housesNetWorth, currentIndex+1);
        return Math.max(stealCurrentHouse, skipCurrentHouse);

    }

    public int maxMoney(int[] housesNetWorth){
      return  maxMoneyRecursive(housesNetWorth, 0);
    }
}
