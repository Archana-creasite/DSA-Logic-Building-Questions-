import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int Number = sc.nextInt();
        int sum = 0;
        for (int n = 1; n <= Number; n++) {
            System.out.print(n + " ");
            sum = sum + n;
        }
        System.out.println();
        System.out.println("Sum = " +sum);
    }
}