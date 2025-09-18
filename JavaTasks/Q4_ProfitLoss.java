// Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191.
public class Q4_ProfitLoss {
    public static void main(String[] args) {
        int cost = 129, sell = 191;
        int profit = sell - cost;
        double profitPercent = (profit * 100.0) / cost;
        System.out.println("The Cost Price is INR " + cost + " and Selling Price is INR " + sell +
                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }
}