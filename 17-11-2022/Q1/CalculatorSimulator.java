package Lab;

public class CalculatorSimulator {

	public static void main(String[] args) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
TaxCalculator tc=new TaxCalculator();
System.out.println("Tax amount is:"+(tc.calculateTax("pil", true, 30000)));
	
	}

}
