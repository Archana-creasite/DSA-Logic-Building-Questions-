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
        double lossPercentage = ( Loss / cp ) * 100;
            System.out.println("Loss = " + Loss);
            System.out.println("Percentage = " + lossPercentage );
             }

        else if (sp > cp) {
            double Profit = sp - cp;
            Double ProfitPercentage = ( Profit / cp) * 100;
            System.out.println("Profit = " + Profit );
            System.out.println("Percentage = " + ProfitPercentage );
        } else {
            System.out.println("Not a loss and Not a profit");

        }

    }