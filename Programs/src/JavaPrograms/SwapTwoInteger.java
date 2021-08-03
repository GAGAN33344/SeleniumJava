package JavaPrograms;

public class SwapTwoInteger {

	public static void main(String[] args) {

         int x=5;
         int y=10;
         
         System.out.println("value of X before swaping : " + x);
         System.out.println("value of Y before swaping : " + y);
         
         System.out.println("*********");
         
        //1. Swap with third variable
//         int temp;
//         
//         temp=x;//5
//         x=y;//10
//         y=temp;//5
//         
       //2. Swap without third variable, swap with + operator
//         x = x+y;//15
//         y=x-y;//5
//         x=x-y;//10
        		 
       //3. Swap without third variable, swap with * operator
//         x = x*y;//50
//         y = x/y;//5
//         x = x/y;//10
         
       //4. Swap without third variable, swap with XOR bitwise operator
         x = x ^ y;//15-->1111
         y = x ^ y;//10-->1010
         x = x ^ y;//5-->0101
         
         
         System.out.println("value of X after swaping : " + x);
         System.out.println("value of Y after swaping : " + y);
         
	}

}
