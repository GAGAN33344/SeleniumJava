
public class Practice {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5};
		
		System.out.println(a.length);
		
		System.out.println("*************");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("reverese order");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}
