import java.util.Scanner;

import payrollabstractclass.Payroll;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees: ");
        int num = sc.nextInt();
        Payroll payroll = new Payroll(num);
        payroll.readEmployees();
        System.out.println("\n\nSummary of Payroll Processing");
        System.out.println("=============================");
        payroll.processPayroll();
        sc.close();
    }
}
