
class Main{
    public static void main(String[] args) {
        TreeNode drinks= new TreeNode("Drinks");
        TreeNode hot= new TreeNode("Hot");
        TreeNode cold= new TreeNode("Cold");

        TreeNode tea= new TreeNode("tea");
        TreeNode coffee= new TreeNode("coffee");
        TreeNode wine= new TreeNode("wine");
        TreeNode beer= new TreeNode("beer");

        drinks.addChild(cold);
        drinks.addChild(hot);

        cold.addChild(beer);
        cold.addChild(wine);
        hot.addChild(tea);
        hot.addChild(coffee);
        System.out.println(drinks.print(0));

    }
}