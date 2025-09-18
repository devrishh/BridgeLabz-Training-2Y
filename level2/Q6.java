package level2;

import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sh=new Scanner(System.in);
        float a = sh.nextFloat();
        float b = sh.nextFloat();
        System.out.println("the quiotent is "+(int)(a/b)+
                " " +
                "the remainder is "+a%b);
    }
}
