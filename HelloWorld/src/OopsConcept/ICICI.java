package OopsConcept;

/*
  This class is responsible for implements all the methods that are present 
  in USBANK interface and RBI interface. 
  Java allows you to implement more than one interface in a Class.
*/

public class ICICI implements USBANK, RBI {
	
	public void educationLoan() {
		System.out.println("ineterst rate is 2.5 percent");
	}
	
   public  void carLoan() {
	   System.out.println("ineterst rate is 7.5 percent");
    }
    
    public void moneyTransfer() {
    	System.out.println("Transfer limit is 2000 dollar per day");
    }
    
    public void mortgage() {
    	System.out.println("ineterst rate is 2.5 percent");
    	
    }
    
    void credit() { // this method from ICICI Bank
    	System.out.println("Credit limit is 5500 dollars");
    }
	public static void main(String[] args) { 
        ICICI IC = new ICICI();/*this IC reference variable is responsible for calling 
        the all methods, which are present in ICICI class, USBANK interface, 
        and RBI interface this is known as STATIC OR COMPILE TIME POLYMORPHISM.*/
        IC.credit();
        IC.carLoan();
        IC.educationLoan();
        IC.moneyTransfer();
        IC.mortgage();
        System.out.println(" i am data member from USBANK " + IC.a);
        
        // or
        USBANK UB = new ICICI();
        UB.educationLoan();
        UB.carLoan();
        
        //or
        RBI RB = new ICICI();
        RB.moneyTransfer();
        RB.mortgage();
       
	}

}
