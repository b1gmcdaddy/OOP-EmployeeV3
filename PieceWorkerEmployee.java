package employee3;

public class PieceWorkerEmployee extends Employee{
	private int pieceFinished;
	private float rate;
	
	public PieceWorkerEmployee() {
		super();
	}
	
	public PieceWorkerEmployee(int empID, String empName, int pieceFinished, float rate) {
		super.setEmpID(empID);
		super.setEmpName(empName);
		this.pieceFinished = pieceFinished;
		this.rate = rate;
	}

	public float getRatePerPiece() {
		return rate;
	}
	
	public void setRatePerPiece(float rate) {
		this.rate = rate;
	}
	
	public int getPieceFinished() {
		return pieceFinished;
	}
	
	public void setPiecefinished(int pieceFinished) {
		this.pieceFinished = pieceFinished;
	}
	
	public float computeSalary() {
		float salary, finished, bonus;
		bonus = 0;
		finished = this.pieceFinished;
		
		salary = finished * this.rate;
		
		if(finished>=100) {
		finished = this.pieceFinished / 100; 
		bonus = this.rate * 5 * finished;
		salary = salary + bonus;
		}
		return salary;
		
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("PIECE FINISHED: " + this.getPieceFinished());
		System.out.println("RATE PER PIECE: " + this.getRatePerPiece());
		System.out.println("SALARY: " + this.computeSalary());
	}
	

	
//	@Override
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//
//		sb.append(super.toString());
////		super.toString();
//		sb.append("\nPIECE FINISHED: ");
//		sb.append(String.format("%d", this.getPiecefinished()));
//		
//		return sb.toString();
//	}
}