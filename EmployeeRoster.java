package employee3;


public class EmployeeRoster extends Employee {
    private Employee[] list;
    private int count;
    private int max;

    public EmployeeRoster() {
        this(10);
    }

    public EmployeeRoster(int max) {
        this.max = max;
        list = new Employee[this.max];
    }

    public boolean addEmployee(Employee e) {
        if (count >= max) {
            return false;
        }
        list[count++] = e;
        return true;
    }

    public Employee deleteEmployee(int empID) {
        for (int i = 0; i < count; i++) {
            if (list[i].getEmpID() == empID) {
                Employee e = list[i];
                for (int j = i; j < count - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[--count] = null;
                return e;
            }
        }
        return null;
    }


    public EmployeeRoster searchEmployee(String letters) {
        EmployeeRoster result = new EmployeeRoster(max);
        for (int i = 0; i < count; i++) {
            if (list[i].getEmpName().contains(letters)) {
                result.addEmployee(list[i]);
            }
        }
        return result;
    }

    public void displayEmployees() {
        for (int i = 0; i < count; i++) {
            list[i].displayInfo();
            System.out.println();
        }
    }

    public int countHourlyEmployee() {
        int count = 0;
        for (int i = 0; i < this.count; i++) {
            if (list[i] instanceof HourlyEmployee) {
                count++;
            }
        }
        return count;
    }

    public int countPieceWorkerEmployee() {
        int count = 0;
        for (int i = 0; i < this.count; i++) {
            if (list[i] instanceof PieceWorkerEmployee) {
                count++;
            }
        }
        return count;
    }
    
    public int countCommissionEmployee() {
        int count = 0;
        for (int i = 0; i < this.count; i++) {
            if (list[i] instanceof CommissionEmployee) {
                count++;
            }
        }
        return count;
    }
    
    public int countBasePlusCommissionEmployee() {
        int count = 0;
        for (int i = 0; i < this.count; i++) {
            if (list[i] instanceof BasePlusCommissionEmployee) {
                count++;
            }
        }
        return count;
    }
}
