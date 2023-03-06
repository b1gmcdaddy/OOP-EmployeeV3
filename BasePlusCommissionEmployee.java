package employee3;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private float baseSalary;


    public BasePlusCommissionEmployee() {
        super();
    }

    public BasePlusCommissionEmployee(int empID, String empName, float totalSales, float baseSalary) {
        super(empID, empName, totalSales);
        this.baseSalary = baseSalary;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public float computeSalary() {
        float salary = super.computeSalary();

        salary += this.baseSalary;

        return salary;
    }

    public void displayInfo() {
    	System.out.println("BASE + COMMISION EMPLOYEE");
        super.displayInfo();
        System.out.println("BASE SALARY: " + this.getBaseSalary());
    }
}
