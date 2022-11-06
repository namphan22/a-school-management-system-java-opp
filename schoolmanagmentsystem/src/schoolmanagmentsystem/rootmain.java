package schoolmanagmentsystem;
import java.util.List;
import java.util.ArrayList;

public class rootmain {
	public static void main(String[] args) {
	
	
		teacher ms_Duyen = new teacher(1, "Duyen", 400);
		teacher ms_Hoa = new teacher(2, "Hoa", 600);
		teacher ms_Hue = new teacher(3, "Hue", 700);
		
		List<teacher> teacherList = new ArrayList<>();
		teacherList.add(ms_Duyen);
		teacherList.add(ms_Hoa);
		teacherList.add(ms_Hue);
		
		teacher ms_Loan = new teacher(4, "Loan", 200);
		
	
		
		student nam = new student(1, "Nam Phan","20TDHCLC3");
		student hoang = new student(2, "Hoang Le","20TDHCLC3");
		student thao = new student(3, "Thao Than","20TDHCLC3");
		
		List<student> studentList =new ArrayList<>();
		studentList.add(nam);
		studentList.add(hoang);
		studentList.add(thao);
		
		
		school _objSchool = new school(studentList, teacherList);
		
		_objSchool.addTeachers(ms_Loan);
		
		
		
		nam.payFees(500);
		System.out.println(nam);
		thao.payFees(500);
		System.out.println(thao);
		

		ms_Duyen.recieveSalary(ms_Duyen.getSalary());
		ms_Hoa.recieveSalary(ms_Hoa.getSalary());

		System.out.println(ms_Duyen);
	
		
		System.out.println("The total number of school revenue " +_objSchool.getTotalMoneyEarned()+ " $");
		
		
		
		
				
		
	}

}
