public void EmployeeSalary extends Employee{
	private double employeeSalary;
	private Stgring emppositon;
	public EmployeeSalary(String first,String last,String ssn,String position,double Salary){

	}
	super(first,last,ssn)
     setemployeeSalary(Salary);
     setempposition(position);
}
public void setSalary(double Salary){
	employeeSalary=Salary < 0.0 ? 0.0 : Salary;
}
public double getSalary(){
	return employeeSalary=Salary;
}
public void setempposition(Sstrin position){
emppositon=position;
}
public getempoposition{
	return emppositon;
}
	return String.format( "salaried employee: %s\n%s: $%,.2f",  super.toString(), "weekly salary", getSalary(),getempoposition );
}