public class EmployeeTest
{
	
	public static void main(String [] args)
	{
		Employee employee=new Employee(101,"AMD",20000);
		
		employee.printEmployeeDetails();
		
		System.out.println("Employee Annual Salary is :"+employee.getAnnualBasic());
		
		
		System.out.println("Employee Monthly Gross Salary is :"+employee.getMonthlyGrossSalary());
		
		System.out.println("Employee Annualy Gross Salary is :"+ employee.getAnnualGrossSalary());
	
		
		System.out.println("Employee Monthly Deduction is :"+employee.getMonthlyDeductions());
	
		System.out.println("Employee Monthly Salary Take Home is :"+employee.getMonthlyTakeHome());
		
		System.out.println("Employee Annualy Salary Take Home is :"+employee.getAnnualyTakeHome());
	}
}