import java.util.ArrayList;

public class Listex {

	public static void main(String[] args) {
		ArrayList<Student>  students=new ArrayList<>();
		Student s1= new Student(100,"xyz");
		Student s2= new Student(100,"xyz");
		Student s3= new Student(100,"xy");
		
		
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(new Student(12,"D"));
		
		
	for (Student  n: students)
	{
		System.out.println(n);
	}

	
	
	ArrayList<Employee>  employee =new ArrayList<>();
	Employee e1= new Employee(100,"xyz",200000);
	Employee e2= new Employee(100,"xyz",200000);
	Employee e3= new Employee(100,"xyz",200000);
	
	employee.add(e1);
	
	employee.add(new Employee(12,"D",51210));
	
	
for (Employee e: employee)
{
	System.out.println(e);
}
	}
}


