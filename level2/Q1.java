package level2;

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sh=new Scanner(System.in);
        float a = sh.nextFloat();
        float b = sh.nextFloat();
        String c= sh.next();
        if (c=="addition"){
            System.out.println(a+b);
        }
        else if (c=="subtraction"){
            System.out.println(a-b);
        }
        else if (c=="division"){
            System.out.println(a/b);
        }
        else if (c=="multiplication"){
            System.out.println(a*b);
        }
        else if (c=="remainder"){
            System.out.println(a%b);
        }
        else{
            System.out.println("Enter a valid arthmetic " +
                    "operation");
        }
    }
}
