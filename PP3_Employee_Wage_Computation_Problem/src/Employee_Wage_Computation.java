public class Employee_Wage_Computation {
	
	public static void main(String[] args) {
	
		
		System.out.println("Welcome to Employee Wage Computation Program");
		int employee_present = 1;
		int employee_wage=0;
		int wage_Per_Hour = 20;
		int hour_per_day =8;
		int attendance_Check = (int)(Math.random()*10)%2;
			if(attendance_Check==employee_present)
			{
				employee_wage = wage_Per_Hour*hour_per_day;
				System.out.println("Employee is present and the wage of employee is : "+employee_wage);
			}	
			else
				System.out.println("Employee is absent");
		
	}
}
