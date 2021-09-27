import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO: part 3 of lab

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive interger: ");
		int x = in.nextInt();
		//System.out.println(x);
		System.out.println();
		System.out.println("The first " + x + " postive odd intergers are: ");
		
		
		int sum = 0;
		int currentOdd = 1;
		
		for(int i = 0; i < x; i++) {
			System.out.print(currentOdd + " ");
			sum = currentOdd + sum;
			currentOdd = currentOdd + 2;
			
			
			
		}
		System.out.println();
		System.out.println();
		System.out.println("The sum of the first 5 positive odd integers: " + sum);
	}

}
