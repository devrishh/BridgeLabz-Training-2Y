// Create a program to find the maximum number of handshakes among N number of students.
import java.util.Scanner;
public class Q16_Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of possible handshakes is " + handshakes);
    }
}