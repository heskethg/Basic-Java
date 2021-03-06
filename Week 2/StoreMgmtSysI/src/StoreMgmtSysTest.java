import java.util.Scanner;

public class StoreMgmtSysTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees: ");
        int num = sc.nextInt();
        Employee[] employees = new Employee[num];
        employees[0] = new Employee(100, "John", "Doe", "doe@test.com", 1234567890);
        for (int i = 1; i < num; i++) {
            int emp = i + 1;
            System.out.println("Enter details of employee " + emp);
            System.out.println("***************************");
            employees[i] = new Employee();
            employees[i].readEmployeeInfo();
        }
        System.out.printf("%n%s%n%s%n", "List of Employees", "*****************");
        System.out.printf("%12s | %20s | %20s | %12s | %12s | %n %s %n", "Employee#", "Name", "Email", "Phone", "Salary",
         "=========================================================================================");
        for (int i = 0; i < num; i++) {
            employees[i].printEmployee();
        }
    }
}
