public class Employee_Wage_Computation {
	

	public static void main(String[] args) {
	
		
		System.out.println("Welcome to Employee Wage Computation Program");
		final int employee_Full_Time = 1;
		final int employee_Part_Time = 2;
		int employee_wage=0;
		int wage_Per_Hour = 20;
		int hour_per_day =8;
		int hour_half_day=4;
		int working_Day =20;
		int wage ;
	
			
			for (int i = 0; i < working_Day; i++) {
				int attendance_Check = (int)(Math.random()*10)%3;
				switch (attendance_Check)
				{
				case employee_Full_Time:
				{
					wage = wage_Per_Hour*hour_per_day;
					employee_wage = employee_wage + wage;
					break;
				
				}
				case employee_Part_Time:
				{
					wage = wage_Per_Hour*hour_half_day;
					employee_wage = employee_wage + wage;
					
					break;
				}
				default :
				{
					break;
				}
				}			
			}
			System.out.println("Total wege of employee in the month is : "+employee_wage);
			
	}
}
