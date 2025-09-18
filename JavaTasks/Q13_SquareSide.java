// Write a program to find the side of the square whose perimeter you read from user 
import java.util.Scanner;
public class Q13_SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}