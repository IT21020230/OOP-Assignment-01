
public class Manager extends Employee {
    protected double allowances;
    protected double deductions;

    public Manager() {
        this.allowances = 0.0;
        this.deductions = 0.0;
    }

    public Manager(int empNo, String name, int telephone, double basicsalary, double allowances, double deductions) {
        super(empNo, name, telephone, basicsalary);
        this.allowances = allowances;
        this.deductions = deductions;
    }

    public void setAllowances(double allowances) {
        this.allowances = allowances;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getAllowances() {
        return allowances;
    }

    public double getDeductions() {
        return deductions;
    }

    public double calcNetSalary() {
        return basicsalary + allowances - deductions ;
    }

}
