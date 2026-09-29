import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value Cp : ");
        double cp = sc.nextDouble();

        System.out.print("Enter the value of Sp : ");
        double sp = sc.nextDouble();

        if (cp > sp) {
            double Loss = cp - sp;
            System.out.println("Loss = " + Loss);
        }

        else if (sp > cp) {
            double Profit = sp - cp;
            System.out.println("Profit = " + Profit);
        } else {
            System.out.println("Not a loss and Not a profit");

        }

    }
}