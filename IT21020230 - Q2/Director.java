
public class Director extends Manager{
    protected double bonus;
    protected double entertainmentAllowance;

    public Director() {
        this.bonus = 0.0;
        this.entertainmentAllowance = 0.0;
    }

    public Director(int empNo, String name, int telephone, double basicsalary, double allowances, double deductions, double bonus, double entertainmentAllowance) {
        super(empNo, name, telephone, basicsalary, allowances, deductions);
        this.bonus = bonus;
        this.entertainmentAllowance = entertainmentAllowance;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setEntertainmentAllowance(double entertainmentAllowance) {
        this.entertainmentAllowance = entertainmentAllowance;
    }

    public double getBonus() {
        return bonus;
    }

    public double getEntertainmentAllowance() {
        return entertainmentAllowance;
    }

    public double calcNetSalary() {
        return basicsalary + allowances - deductions + bonus + entertainmentAllowance;
    }

}
