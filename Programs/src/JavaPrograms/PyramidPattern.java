package JavaPrograms;

public class PyramidPattern {

	/*
	 1
	 1 1 
	 1 1 1
	 1 1 1 1
	 1 1 1 1 1
	 1 1 1 1 1 1
	 */
	public static void main(String[] args) {

		for(int i=1; i<6; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("1");
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
