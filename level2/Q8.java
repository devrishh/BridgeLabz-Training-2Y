package level2;

import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sh=new Scanner(System.in);
        double a = sh.nextDouble();
        double b = sh.nextDouble();
        double c = sh.nextDouble();

        System.out.println("a + b *c = "+(a + b *c));
        System.out.println("a * b + c = "+(a * b + c));
        System.out.println("c + a / b"+(c + a / b));
        System.out.println("a % b + c = "+(a % b + c));
    }
}