public class Employee_Wage_Computation {
	

	public static void main(String[] args) {
	
		
		System.out.println("Welcome to Employee Wage Computation Program");
		final int employee_Full_Time = 1;
		final int employee_Part_Time = 2;
		int employee_wage=0;
		int wage_Per_Hour = 20;
		int hour_per_day =8;
		int hour_half_day=4;
	
			int attendance_Check = (int)(Math.random()*10)%3;
			
			switch (attendance_Check)
			{
			case employee_Full_Time:
			{
				employee_wage = wage_Per_Hour*hour_per_day;
				System.out.println("Employee is present and the wage of employee is : "+employee_wage);
				break;
			
			}
			case employee_Part_Time:
			{
				employee_wage = wage_Per_Hour*hour_half_day;
				System.out.println("Employee is present in half of the day"
						+ " and the wage of employee is : "+employee_wage);
				break;
			}
			default :
			{
				System.out.println("Employee is absent and the wage is : "+employee_wage);
				break;
			}
			}
		
	}
}
