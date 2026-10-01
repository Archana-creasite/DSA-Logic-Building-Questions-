import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number :");
        double num1 = sc.nextDouble();

        System.out.print("Enter the oprator (-,+,*,/) :");
        char oprator = sc.next().charAt(0);

        System.out.print("Enter the Second number :");
        double num2 = sc.nextDouble();

        switch (oprator) {
            case '-':
                System.out.println(num1 - num2);
                break;
            case '+':
                System.out.println(num1 + num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divided by zero");
                } else {
                    System.out.println(num1 / num2);
                }
                break;

            default:
                System.out.println("Invalid Oprator");

        }

    }
}