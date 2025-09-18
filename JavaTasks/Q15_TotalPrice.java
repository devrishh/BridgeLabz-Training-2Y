// Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
import java.util.Scanner;
public class Q15_TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();
        double total = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}