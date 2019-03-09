public class Employee 
	{
	
	 private int employeeId;
	 private String employeeName;
	 private double employeeMonthlySalary;
	 private double MEDICAL_ALLOWANCE =  1250;
	 private double CONVEYANCE_ALLOWANCE = 800;
	 private double pf;
	 private double esic;
	 private double profTax;

	public Employee(int employeeId,String employeeName,double employeeMonthlySalary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeMonthlySalary=employeeMonthlySalary;	
	}
	
	public void printEmployeeDetails()
	{
		System.out.println("Employee Id is :"+employeeId);
		System.out.println("Employee Name is :"+employeeName);
		System.out.println("Employee Salary is :"+employeeMonthlySalary);
	
	}

	public double getAnnualBasic()
	{
		System.out.println("Employee Monthly Salary is :"+employeeMonthlySalary);
		return 12 * employeeMonthlySalary;
	}

		
	public double getMonthlyGrossSalary()
	{
		double HRA=employeeMonthlySalary/2;
		return HRA+employeeMonthlySalary+MEDICAL_ALLOWANCE+CONVEYANCE_ALLOWANCE;
	}

	public double getAnnualGrossSalary()
	{
		return 12 * getMonthlyGrossSalary();
	}

	public double getMonthlyDeductions()
	{
		if(employeeMonthlySalary/10 < 6500)
		{
			pf =employeeMonthlySalary/10;	
		}
		else{
			pf=6500;	
		}
					
		if(employeeMonthlySalary < 6500)
		{
			esic= employeeMonthlySalary * (4.75/100);	
		}
		else{
			esic=0;	
		}

		if(getMonthlyGrossSalary() <= 10000)
		{
			profTax=50;
		}
		else{
			profTax=100;
		}
	
		return pf+esic+profTax;
	}

	public double getMonthlyTakeHome()
	{
		return getMonthlyGrossSalary() - getMonthlyDeductions();
	}

	public double getAnnualyTakeHome()
	{
		return 12 * getMonthlyTakeHome();
	}

}
