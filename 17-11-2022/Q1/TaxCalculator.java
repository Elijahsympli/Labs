package Lab;
public class TaxCalculator {
	double taxAmount;
	int i;
 public double calculateTax(String empName,boolean isIndian,double empSal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
	i++; 
	if(isIndian!=true) {
			throw new CountryNotValidException("\n"+"Test Case:" +i +"\n"+ "Employee Name:"+empName+"\n"+"Employee Salary:"+empSal+"\n "+"Is Indian:"+isIndian+"\n "+"Expected message" +"The employee should be an Indian citizen for calculating tax");	
	}
	else if(empName==null) {
			throw new EmployeeNameInvalidException("\n"+"Test Case:" +i +"\n"+ "Employee Name:"+empName+"\n"+"Employee Salary:"+empSal+"\n "+"Is Indian:"+isIndian+"\n "+"Expected message" +"The employee name cannot be empty");
			
	}
	else if (empSal>100000	&& isIndian==true) {
	taxAmount=empSal*8/100;
	System.out.println("\n"+"Test Case:" +i +"\n"+ "Employee Name:"+empName+"\n"+"Employee Salary:"+empSal+"\n "+"Is Indian:"+isIndian+"\n "+"Expected message:" + taxAmount);
	}
else if(empSal<100000 && empSal>=50000 && isIndian==true) {
	taxAmount=empSal*6/100;
	System.out.println("\n"+"Test Case:" +i +"\n"+ "Employee Name:"+empName+"\n"+"Employee Salary:"+empSal+"\n "+"Is Indian:"+isIndian+"\n "+"Expected message:" + taxAmount);
}
else if(empSal<50000 && empSal>=30000 && isIndian==true)
{
	taxAmount=empSal*5/100;
	System.out.println("\n"+"Test Case:" +i +"\n"+ "Employee Name:"+empName+"\n"+"Employee Salary:"+empSal+"\n "+"Is Indian:"+isIndian+"\n "+"Expected message:" + taxAmount);
}
else if(empSal<30000 && empSal>=10000 && isIndian==true)
{
	taxAmount=empSal*4/100;
	System.out.println("\n"+"Test Case:" +i +"\n"+ "Employee Name:"+empName+"\n"+"Employee Salary:"+empSal+"\n "+"Is Indian:"+isIndian+"\n "+"Expected message:" + taxAmount);
}
else {
	
	throw new TaxNotEligibleException("\n"+"Test Case:" +i +"\n"+ "Employee Name:"+empName+"\n"+"Employee Salary:"+empSal+"\n "+"Is Indian:"+isIndian+"\n "+"Expected message" +"The employee does not need to pay tax");
	
}
	
	 return taxAmount;
 }
}
