package schoolmanagmentsystem;

public class student {
	private int id;
	private String name;
	private String grade;
	private int feePaid;
	private int feeTotal;
	
	// constructor
	public student(int id,String name,String grade) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.grade =grade;
		this.feePaid =0;
		this.feeTotal = 20000;
		
		
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void updateFeePaid(int fees) {
		feePaid+=fees;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the feePaid
	 */
	public int getFeePaid() {
		return feePaid;
	}
	
	
	/**
	 * @return the feeTotal
	 */
	public int getFeeTotal() {
		return feeTotal;
	}
	
	/**
	 * @return the grade
	 */
	
	public String getGrade() {
		return grade;
	}
	
	public void payFees(int fees) {
		feePaid+=fees;
		school.updateTotalMoneyEarned(feePaid);
		// ôn cái static method hơi khó hiểu.
		
	}
	
	public int getRemainingFees() {
		return feeTotal - feePaid;
		
	}
	public String toString() {
		return "Student's name:"+name+" Total fees paid "+feePaid;
	}
	
	
	

}

