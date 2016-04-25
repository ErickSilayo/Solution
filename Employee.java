public class Employee{
 private String firstName;
 private String lastName;
 private String secutityNo;
	public Employee(String first,String last,String ssn){
	firstName=first;
	lastName=last;
	securityNo=ssn;
	}
	public void setfirstName(String first){
	firstname=first;
	}
	public String getfirstName(){
	return firstName;
	}
	public void setlastName(String lastName){
	lastName=last;
	}
	public String getlastName(){
    return lastName;
	}
	public void setsecurityNo(String secutityNo){
	securityNo=ssn;
	}
	public String getsecurityNo(){
	return securityNo;
	}
	public String toString{
	return String format( "%s %s\nsocial security number: %s", 58 getFirstName(),getLastName(),getSocialSecurityNumber() );
	}

}