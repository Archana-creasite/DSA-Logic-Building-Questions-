import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Units = ");
        int unit = sc.nextInt();
        int bill;

        if (unit <= 100) {
            bill = unit * 5;
        } else if (unit <= 200) {
            bill = (100 * 5) + (unit - 100) * 7;
        } else {
            bill = (100 * 5) + (100 * 7) + (unit - 200) * 10;
        }
        System.out.println("Electricity Bill = Rs " + bill);
    }

}