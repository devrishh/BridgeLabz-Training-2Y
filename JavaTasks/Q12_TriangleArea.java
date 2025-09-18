// Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
import java.util.Scanner;
public class Q12_TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        double areaCm = area * 6.4516;
        System.out.println("The area in square inches is " + area + " and in square cm is " + areaCm);
    }
}