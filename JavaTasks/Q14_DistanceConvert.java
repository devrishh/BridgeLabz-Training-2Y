// Write a program the find the distance in yards and miles for the distance provided by user in feet
import java.util.Scanner;
public class Q14_DistanceConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet = sc.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
    }
}