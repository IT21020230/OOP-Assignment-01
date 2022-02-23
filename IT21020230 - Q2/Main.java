
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee(1001, "Saman", 774923584, 65000.00, 16 ,1000.00);
        System.out.print("Employee Number: " + e1.getEmpNo() + "\nEmployee name: " + e1.getName() + "\n");
        e1.displayNetSalary();

        Manager m1 = new Manager(2122, "Kumara", 762949202, 80000.00, 18000.00, 5600.00);
        System.out.print("Employee Number: " + m1.getEmpNo() + "\nEmployee name: " + m1.getName() + "\n");
        m1.displayNetSalary();

        Director d1 = new Director(3579, "Kusumsiri", 764597256, 112000.00, 34000.00, 3450.55, 13400.00, 19000.00);
        System.out.print("Employee Number: " + d1.getEmpNo() + "\nEmployee name: " + d1.getName() + "\n");
        d1.displayNetSalary();

        Employee e2 = new Employee();
        System.out.println("Enter employee number:");
        int eNo = sc.nextInt();
        e2.setEmpNo(eNo);
        System.out.println("Enter employee's name:");
        String eName = sc.next();
        e2.setName(eName);
        System.out.println("Enter employee's telephone (9 digits without 0):");
        int eTelephone = sc.nextInt();
        e2.setTelephone(eTelephone);
        System.out.println("Enter employee's basic salary:");
        double eBasicSalary = sc.nextDouble();
        e2.setBasicsalary(eBasicSalary);
        System.out.println("Enter employee's ot hours:");
        int eOtHrs = sc.nextInt();
        e2.setOthrs(eOtHrs);
        System.out.println("Enter employee's ot rate:");
        double eOtRate = sc.nextDouble();
        e2.setOtrate(eOtRate);
        System.out.print("Employee Number: " + e2.getEmpNo() + "\nEmployee name: " + e2.getName() + "\n");
        e2.displayNetSalary();

        Manager m2 = new Manager();
        m2.setEmpNo(2125);
        m2.setName("Udantha");
        m2.setTelephone(756284876);
        m2.setBasicsalary(76500.00);
        m2.setAllowances(22000.00);
        m2.setDeductions(7156.87);
        System.out.print("Employee Number: " + m2.getEmpNo() + "\nEmployee name: " + m2.getName() + "\n");
        m2.displayNetSalary();

        Director d2 = new Director();
        d2.setEmpNo(3580);
        d2.setName("Sirimath");
        d2.setTelephone(756284876);
        d2.setBasicsalary(98700.00);
        d2.setAllowances(15000.00);
        d2.setDeductions(4356.50);
        d2.setBonus(32002.00);
        d2.setEntertainmentAllowance(12000.00);

        System.out.println("Employee Number: " + d2.getEmpNo());
        System.out.println("Employee Name: " + d2.getName());
        System.out.println("Employee Telephone: " + d2.getTelephone());
        System.out.println("Employee Basic Salary: " + d2.getBasicsalary());
        System.out.println("Employee Allowances: " + d2.getAllowances());
        System.out.println("Employee Deductions: " + d2.getDeductions());
        System.out.println("Employee Bonus: " + d2.getBonus());
        System.out.println("Employee get Entertainment Allowance: " + d2.getEntertainmentAllowance());
        d2.displayNetSalary();
    }
}
