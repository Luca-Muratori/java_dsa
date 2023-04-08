class Main{
    public static void main(String[] args) {
        Factor fact=new Factor();
        // System.out.println(fact.waysToGetN(43));

        HouseRobber houseRobber=new HouseRobber();
        int[] netWorth={1,3,4,34,44,54};
        int result=houseRobber.maxMoney(netWorth);
        System.out.println(result);

        Knapsac knap=new Knapsac();
        int[] weights={3,1,2,5};
        int[] profits={31,26,17,72};
        int maxProfit=knap.knapsac(profits, weights, 7);
        System.out.println(maxProfit);
    }
}