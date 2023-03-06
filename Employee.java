package employee3;

public class Employee {
	private int empID;
	private String empName;
	
	public Employee() {
		super();
	}

	public Employee(int empID, String empName) {
		this.empID = empID;
		this.empName = empName;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void displayInfo() {
		System.out.println("ID: " + this.getEmpID());
		System.out.println("NAME: " + this.getEmpName());
//		System.out.println(this);
	}

}