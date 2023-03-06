package employee3;

public class Test {

    public static void main(String[] args) {

        EmployeeRoster rtest = new EmployeeRoster(10);

        HourlyEmployee emp1 = new HourlyEmployee(1, "Abbadon", 5, 100);
        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(2, "Antimage", 310, 1);
        HourlyEmployee emp3 = new HourlyEmployee(3, "Rubick", 10, 105);
        CommissionEmployee emp4 = new CommissionEmployee(4, "Mars", 11000);
        BasePlusCommissionEmployee emp5 = new BasePlusCommissionEmployee(5, "Viper", emp4.getTotalSales(), 5000);
        
        //add employees
        rtest.addEmployee(emp1);
        rtest.addEmployee(emp2);
        rtest.addEmployee(emp3);
        rtest.addEmployee(emp4);
        rtest.addEmployee(emp5);
        
        rtest.displayEmployees();     //display added employees

        System.out.println("\nAFTER DELETING EMPLOYEES 2 & 5.");
        rtest.deleteEmployee(2);
        rtest.deleteEmployee(5);
        rtest.displayEmployees();   //display after deletion


        System.out.println("\nSEARCH FOR AN EMPLOYEE BY NAME OR LETTERS FROM NAME: ");
        EmployeeRoster result = rtest.searchEmployee("ubic");
        if (result != null) {
            result.displayEmployees();
        } 
        

        System.out.println("\nCOUNT EMPLOYEES: ");    //counting employees of each category
        System.out.println("Hourly employees: " + rtest.countHourlyEmployee());
        System.out.println("Piece worker employees: " + rtest.countPieceWorkerEmployee());
        System.out.println("Commission employees: " + rtest.countCommissionEmployee());
        System.out.println("BasePlusCommission employees: " + rtest.countBasePlusCommissionEmployee());
    }
}
