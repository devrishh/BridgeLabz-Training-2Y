package level2;

import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sh=new Scanner(System.in);
        float a = sh.nextFloat();
        float b = sh.nextFloat();
        float c = sh.nextFloat();

        System.out.println("a + b *c = "+(a + b *c));
        System.out.println("a * b + c = "+(a * b + c));
        System.out.println("c + a / b"+(c + a / b));
        System.out.println("a % b + c = "+(a % b + c));
    }
}
