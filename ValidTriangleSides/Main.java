
// A triangle is valid only if the sum of any two sides is greater than the third.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value :");
        int a = sc.nextInt();

        System.out.print("Enter the value :");
        int b = sc.nextInt();

        System.out.print("Enter the value :");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid Trangle");
        } else {
            System.out.println("Invalid Trangle");
        }

    }
}