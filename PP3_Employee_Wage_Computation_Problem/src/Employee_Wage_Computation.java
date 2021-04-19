
public class Employee_Wage_Computation {
	public static void main(String[] args) {
	
		System.out.println("Welcome to Employee Wage Computation Program");
			
		int attendance_Check = (int)(Math.random()*10)%2;
		if(attendance_Check==1)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}
}
