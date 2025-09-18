// The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%.
public class Q6_Discount {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;
        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}