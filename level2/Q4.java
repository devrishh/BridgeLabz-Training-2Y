package level2;

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sh=new Scanner(System.in);
        float feet = sh.nextFloat();
        System.out.println("The distance in miles is "+ feet/(1760*3)+" the distance in yards is " +feet/1760);
    }
}
