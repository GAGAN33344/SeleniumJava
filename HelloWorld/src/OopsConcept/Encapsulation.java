package OopsConcept;

public class Encapsulation {
	
	/*
	 * Naveen Automation Labs
	 Encapsulation is also called data hiding
	 Data variables should be private, so that these variables cannot accessed
	 directly from outside of class.
	 Getter and Setter methods to set and get the values of the fields(Data variables).
	 Getter and Setter methods should be public, so that outside class can easily
	 access this methods.
	 */
	private String name;
	private int accountNumber;
	private int mobileNumber;
	private String address;
	
	
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}


	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	
    public int getMobileNumber() {
		return mobileNumber;
	}
    public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

    
	public String getAddress() {
		return address;
	}
    public void setAddress(String address) {
		this.address = address;
	}

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulation EL = new Encapsulation();
		EL.setName("Harpal Singh");
		EL.setAccountNumber(123456789);
		EL.setMobileNumber(987654399);
		EL.setAddress("Jujhar SIngh Nagar");
		
		System.out.println(EL.getName());
		System.out.println(EL.getAccountNumber());
		System.out.println(EL.getMobileNumber());
	    System.out.println(EL.getAddress());
	}

}
