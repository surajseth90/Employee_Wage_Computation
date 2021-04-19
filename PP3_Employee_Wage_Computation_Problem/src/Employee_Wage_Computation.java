class Employee
{
	final int employee_Full_Time = 1;
	final int employee_Part_Time = 2;
	int employee_wage=0;
	int wage_Per_Hour = 20;
	int hour_per_day =8;
	int hour_half_day=4;
	int working_Day =0;
	int working_Hour=0;
	int wage ;
	
	int Wage_Calculator()
	{

		while(working_Day<=20 &&
				working_Hour<=100){
			
			int attendance_Check = (int)(Math.random()*10)%3;
			switch (attendance_Check)
			{
			case employee_Full_Time:
			{
				wage = wage_Per_Hour*hour_per_day;
				employee_wage = employee_wage + wage;
				working_Hour=working_Hour+8;
				working_Day++;
				break;
			
			}
			case employee_Part_Time:
			{
				wage = wage_Per_Hour*hour_half_day;
				employee_wage = employee_wage + wage;
				working_Hour=working_Hour+4;
				working_Day++;
				
				break;
			}
			default :
			{
				break;
			}
			}			
		
		}
	return employee_wage;
		
	}
}

public class Employee_Wage_Computation {
	

	public static void main(String[] args) {
	
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
	
		Employee employee = new Employee();
		int employee_wage = employee.Wage_Calculator();
		System.out.println("Total wage of employee in the month is : "+employee_wage);
			
	}
}
