
public class Employee {
				private int id;
				private String desig;
				private  double sal;
				
				public Employee(int id, String desig, double sal) {
					super();
					this.id = id;
					this.desig = desig;
					this.sal = sal;
				}
				@Override
				public String toString() {
					return "Employee [id=" + id + ", desig=" + desig + ", sal=" + sal + "]";
				}
				
				
}
