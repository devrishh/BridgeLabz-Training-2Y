package level2;

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sh=new Scanner(System.in);
        float unit_price = sh.nextFloat();
        float Quantity = sh.nextFloat();

        System.out.println("the total price will be : "+unit_price*Quantity);
    }
}
