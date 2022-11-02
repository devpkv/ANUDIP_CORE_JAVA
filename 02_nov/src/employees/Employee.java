package employees;

public class Employee {

	private int eId;
	private String eName;
	private double eSalary;
	
	public void setEmployeeDetails(int eId,String eName, double eSalary)
	{
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	
	public String getEmployeeDetails()
	{
		return "[ID=" + eId + ", NAME=" + eName + ", Salary=" + eSalary + "]"; 
	}
	
	double hikeSalary() 
	{
		eSalary = (eSalary + (eSalary*5/100));
		return eSalary;
	}
	
	double hikeSalary(float hike) 
	{
		eSalary = (eSalary + (eSalary*hike/100));
		return eSalary;
	}
	
}
