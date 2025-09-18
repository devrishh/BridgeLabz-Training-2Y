import java.util.Scanner;
public class Program12SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1) {
            int s1 = 0;
            int i = 1;
            while (i <= n) {
                s1 += i;
                i++;
            }
            int s2 = n * (n + 1) / 2;
            System.out.println("While loop sum: " + s1);
            System.out.println("Formula sum: " + s2);
            System.out.println("Both are equal? " + (s1 == s2));
        } else {
            System.out.println("Not a natural number");
        }
    }
}