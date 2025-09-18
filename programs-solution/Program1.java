//Write a program to calculate simple interest using the formula:
//Simple Interest = (Principal * Rate * Time) / 100.
//Take Principal, Rate, and Time as inputs from the user.

import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int principle= input.nextInt();
        int rate= input.nextInt();
        int time= input.nextInt();

        double SI =(principle * rate * time )/100;

        System.out.println("the S.i. is the "+SI);

    }
}
