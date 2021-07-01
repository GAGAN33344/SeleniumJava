package OopsConcept;

public class AbstractionsubClass extends Abstraction{

	@Override
	void method1() {
		System.out.println(" I am in Child Class");
	}

	void color() {// this method from AbstractionsubClass
		System.out.println("implementing the color");
		
	}
	public static void main(String[] args ) {
		
		AbstractionsubClass AB = new AbstractionsubClass();
		System.out.println("I am data member from super class " + AB.a);
		AB.method1();
		AB.method2(100);
		AB.color();
		
		
	} 
	
	
}
