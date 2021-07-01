
public class PrintingArrayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// printing the index value of 9
		int c[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 9) {
				System.out.println("index value of number 9 is " + i);
				break;// this means process will come out from all the loop
				// its not checked the remaining numbers and consume the time.
			}
		}

	}

}
