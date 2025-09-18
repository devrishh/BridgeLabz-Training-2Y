import java.util.Scanner;
public class Program13SumNaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1) {
            int s1 = 0;
            for (int i = 1; i <= n; i++) {
                s1 += i;
            }
            int s2 = n * (n + 1) / 2;
            System.out.println("For loop sum: " + s1);
            System.out.println("Formula sum: " + s2);
            System.out.println("Both are equal? " + (s1 == s2));
        } else {
            System.out.println("Not a natural number");
        }
    }
}