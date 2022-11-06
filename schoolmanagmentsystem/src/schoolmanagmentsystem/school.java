package schoolmanagmentsystem;

import java.util.List;

public class school {
	private  List<student> students;
	public List<teacher> teachers;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	/**
	 * @param students
	 * @param teachers
	 */
	public school(List<student> students, List<teacher> teachers) {
		
		this.students = students;
		this.teachers = teachers;
		totalMoneyEarned =0;
		totalMoneySpent =0;
	}
	
	public List<student> getStudents() {
		return students;
	}
	public void addStudents(student student_) {
		students.add(student_);
	}
	
	public List<teacher> getTeachers() {
		return teachers;
	}
	public void addTeachers(teacher teacher_) {
		teachers.add(teacher_);
	}
	
	
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	public static void updateTotalMoneyEarned(int MoneyEarned) {
	    totalMoneyEarned += MoneyEarned;
	}
	
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	// is salary given by the school to its teachers;
	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned -= MoneySpent;
		
	}
	
	
	

}
