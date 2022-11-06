package schoolmanagmentsystem;

public class teacher {
	private int id;
	private String name;
	private int salary;
	public int salaryEarned;
	
	public teacher(int id,String name,int salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name=name;
		this.salary = salary;
		salaryEarned =0;
	}
	public int getId() {
		return id;
		
	}
	public String getName() {
		return name;
		
	}

	public int getSalary() {
		
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
		
	}
	public void recieveSalary(int salary) {
		salaryEarned+=salary;
		school.updateTotalMoneySpent(salary);
	}
	public String toString() {
		return "The school has paid salary for "+name+ " with "+salaryEarned+" $";
	}
}
