package week3.day1.assignments;

/*
 *     Class     :BankInfo
    Methods :saving(),fixed(),deposit()

     Class     :AxisBank
     Methods :deposit()

Description:
You have to override the method deposit in AxisBank.

 */
public class AxisBank extends BankInfo{
	
	// Overrided the method deposit() to convey the Terms n Conditions.
	public void deposit()
	{
		System.out.println("AXIS BANK - Terms n Conditions changed for Deposit Account...");
	}

	public static void main(String[] args) {
		
		// Create an object for the class AxisBank
		AxisBank newCustomer = new AxisBank();
		
		// Call the methods from the Base class
		newCustomer.saving();
		newCustomer.fixed();
		
		// Call the Overrided method
		newCustomer.deposit();
	}
}
