
public class Employee {
    protected int empNo;
    protected String name;
    protected int telephone;
    protected double basicsalary;
    protected int othrs;
    protected double otrate;

    public Employee() {
        this.empNo = 0;
        this.name = null;
        this.telephone = 0;
        this.basicsalary = 0.0;
        this.othrs = 0;
        this.otrate = 0.0;
    }

    public Employee(int empNo, String name, int telephone, double basicsalary) {
        this.empNo = empNo;
        this.name = name;
        this.telephone = telephone;
        this.basicsalary = basicsalary;
    }
    public Employee(int empNo, String name, int telephone, double basicsalary, int othrs, double otrate) {
        this.empNo = empNo;
        this.name = name;
        this.telephone = telephone;
        this.basicsalary = basicsalary;
        this.othrs = othrs;
        this.otrate = otrate;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setBasicsalary(double basicsalary) {
        this.basicsalary = basicsalary;
    }

    public void setOthrs(int othrs) {
        this.othrs = othrs;
    }

    public void setOtrate(double otrate) {
        this.otrate = otrate;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getName() {
        return name;
    }

    public int getTelephone() {
        return telephone;
    }

    public double getBasicsalary() {
        return basicsalary;
    }

    public int getOthrs() {
        return othrs;
    }

    public double getOtrate() {
        return otrate;
    }

    public double calcNetSalary() {
        return basicsalary + othrs * otrate;
    }

    public void displayNetSalary() {
        System.out.println("Net Salary = " + calcNetSalary() + "\n");
    }

}
