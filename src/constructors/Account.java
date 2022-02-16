/*Create a class called Account.
  Instance variables: userName, pinNo, balance
  Constructor:  declare a parameterized constructor to initialize the variables.
  Methods:  Getters & setters as needed.
            ValidateAccLogin() - pass input parameters - username and password entered by the user, and compare it with 
                                 initialized values of userName & password
            depositMoney() - pass input parameter - the amount to be deposited entered by user.
            checkBalance() - shows the current balance 
 */
package constructors;

public class Account {

	String userName;
	int pinNo;
	double balance;
	
	public Account(String userName, int pinNo, double balance) {
		this.userName = userName;
		this.pinNo = pinNo;
		this.balance = balance;
	}

	public String getUserName() {
		return userName;
	}

	public int getPinNo() {
		return pinNo;
	}

	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}

	public double getBalance() {	//this method retrieves the value of balance.
		return balance;
	}

	boolean isValidCredentials(String inputUserName, int inputPinNo) {
		if (inputUserName.equals(this.userName) && inputPinNo == this.pinNo) {
			return true;
		}
		return false;
	}

	void depositMoney(double amountToDeposit) {
		if (amountToDeposit > 0) {
			this.balance = balance + amountToDeposit;
			System.out.println("You have deposited $"+ amountToDeposit);
		} else {
			System.out.println("Please enter a valid amount");
		}
	}
	
	

}
