import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employees name: ");
        String name = scanner.nextLine();

        System.out.println("Enter number of hours worked in a week: ");
        Double workedHours = scanner.nextDouble();

        System.out.println("Enter hourly pay rate: ");
        Double payRate = scanner.nextDouble();

        System.out.println("Enter federal tax withholding rate: ");
        Double federalRate = scanner.nextDouble();

        System.out.println("Enter state tax withholding rate: ");
        Double stateTax = scanner.nextDouble();

        Double grossPay = payRate * workedHours;
        System.out.println("Gross Pay: " + grossPay);

        Double federalWitholding = grossPay * federalRate;
        System.out.println("Federal Withholding: " + federalWitholding);

        Double stateWitholding = grossPay * stateTax;
        System.out.println("State Withholding: " + stateWitholding);

        Double totalDeduction = federalWitholding + stateWitholding;
        System.out.println("Total Deduction:: " + totalDeduction);

        Double netPay = grossPay - totalDeduction;
        System.out.println("Net Pay: " + netPay);

    }
}
